
public class Student extends Person {
	private String classCode;
	
	/**
	 * override constructor to add class code
	 */
	public Student() {
		this.classCode = "n/a";
	}
	
	/**
	 * override constructor to add first and last name
	 * @param firstName
	 * @param lastName
	 */
	public Student(String firstName, String lastName) {
		super(firstName, lastName);
		this.classCode = "n/a";
	}
	
	/**
	 * enter personal data for student
	 */
	@Override
	public void enterData(InputReader reader) {
		super.enterData(reader);
				
		System.out.println("Bitte Klasse eingeben");
		this.classCode = reader.scanString();
	}
	
	/**
	 * print a list of attributes for student
	 */
	
	@Override
	public void printIdCard() {
		super.printIdCard();
		System.out.println("Klasse:\t" + this.classCode);
	}
	
	//getters and setters
	
	public String getClassCode() {
		return classCode;
	}
	
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

}