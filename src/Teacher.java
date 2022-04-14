public class Teacher extends Person{
	private String[] subjects;

	public Teacher() {
		this.subjects = new String[0];
	}

	/**
	 * overload constructor to add first and last name
	 * @param firstName
	 * @param lastName
	 */
	public Teacher(String firstName, String lastName) {
		super(firstName, lastName);
		this.subjects= new String[0];
	}

	/**
	 * enter personal data for teacher
	 * calls addSubjects to start a loop for adding subjects
	 */
	@Override
	public void enterData(InputReader reader) {
		super.enterData(reader);
		addSubjects(reader);
	}

	/**
	 * enter one or more subjects in a loop
	 * @param reader
	 */
	private void addSubjects(InputReader reader) {
		boolean done = false; //needed to determine if done adding subjects

		while (!done) {
			//get next subject from user input
			String subject;
			System.out.println("Bitte Schulfach eingeben");
			subject = reader.scanString();

			//add subject to subjects array by creating a copy of array
			String subjectsNew[] = new String[this.subjects.length + 1];
			int i;
			for (i = 0; i < (this.subjects.length); i++) {
				subjectsNew[i] = this.subjects[i];
			}
			subjectsNew[i] = subject;
			this.subjects = subjectsNew;

			//determine if done adding subjects; if done, exit loop
			System.out.println("Eingabe der Fächer beendet? Bestätigen mit Taste J, Fortsetzen mit beliebiger Taste");
			String input = reader.scanString();
			done = input.equalsIgnoreCase("J"); //done turns true, if input is J or j
		}
	}

	/**
	 * print a list of attributes for teacher
	 */
	@Override
	public void printIdCard() {
		super.printIdCard();
		printSubjects();
	}

	/**
	 * print subjects
	 */
	private void printSubjects() {
		System.out.println("Fächer:");
		if(this.subjects.length == 0) {
			System.out.println("Derzeit keine");
		}
		else {
			for (String subject : this.subjects) {
				System.out.println(subject);
			}
		}	
	}

	//Getters & Setters

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

}

