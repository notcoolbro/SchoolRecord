
public class Main {

	public static void main(String[] args) {
		
		//create input reader instance to read user input
		InputReader reader = new InputReader();
		reader.open();

		//create a student file
		Student student = new Student();
		student.enterData(reader);
		
		//create a teacher file
		Teacher teacher = new Teacher();
		teacher.enterData(reader);
		
		//create an employee file without giving a job
		Employee employee1 = new Employee();
		
		//create another employee file
		Employee employee2 = new Employee();
		employee2.setJob("Sekretärin");
		
		//create another employee file with given job
		Employee employee3 = new Employee("Hausmeister");
		employee3.enterData(reader);
		
		//print id cards for everyone
		student.printIdCard();
		teacher.printIdCard();
		employee1.printIdCard();
		employee2.printIdCard();
		employee3.printIdCard();
		
		//close input reader instance
		reader.close();
	}
}
