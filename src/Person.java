
public abstract class Person {
	private int id;
	private String lastName;
	private String firstName;
	private String street;
	private String zipCode;
	private String city;
	private static int personCount = 0; //used for setting ID
	
	/**
	 * constructor with placeholders as initial values
	 * */
	public Person() {
		//increment personCount to create unique id
		personCount++;
		this.id = personCount;
		this.lastName = "n/a";
		this.firstName = "n/a";
		this.street = "n/a";
		this.zipCode = "n/a";
		this.city = "n/a";
	}
	
	/**
	 * enter personal data to fill ID card
	 * @param reader
	 */
	public void enterData(InputReader reader) {
		//print class name of new person instance
		System.out.println("Dateneingabe für " + this.getClass().getSimpleName());
		System.out.println("Bitte Vornamen eingeben");
		this.firstName = reader.scanString();
		System.out.println("Bitte Nachnamen eingeben");
		this.lastName = reader.scanString();
		System.out.println("Bitte Straße eingeben");
		this.street = reader.scanString();
		System.out.println("Bitte PLZ eingeben");
		this.zipCode = reader.scanString();
		System.out.println("Bitte Ort eingeben");
		this.city = reader.scanString();		
	}
	
	/**
	 * print a list of attributes for person
	 */
	public void printIdCard() {
		System.out.println("ID:\t" + this.id);
		System.out.println("Nachname:\t" + this.lastName);
		System.out.println("Vorname:\t" +	this.firstName);	
		System.out.println("Straße:\t" +	this.street);	
		System.out.println("PLZ:\t" +	this.zipCode);	
		System.out.println("Ort:\t" +	this.city);	
	}
	
	//Getters and Setters
		
	public static int getPersonCount() {
		return personCount;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getStreet() {
		return street;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public String getCity() {
		return city;
	}
}
