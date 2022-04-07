
public class Employee extends Person {

	private String job; // the persons occupation

	// override constructor to add job
	public Employee() {
		this.job = "n/a";
	}

	public Employee(String job) {
		this.job = job;
	}

	/**
	 * enter employees personal data
	 */
	@Override
	public void enterData(InputReader reader) {
		super.enterData(reader);
		//only ask for input if constructed without job
		if (job == "n/a") {
			System.out.println("Bitte Aufgabengebiet eingeben");
			this.job = reader.scanString();
		}
	}

	/**
	 * print a list of attributes for employee
	 */
	@Override
	public void printIdCard() {
		super.printIdCard();
		System.out.println("Aufgabengebiet:\t" + this.job);
	}

	// Getters and Setters

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}
