
public class Main {

	public static void main(String[] args) {
		
		//create input reader instance to read user input
		InputReader reader = new InputReader();
		reader.open();

		//create a student file
		Student student = new Student();
		student.enterData(reader);
		student.printIdCard();
		
		//create a teacher file
		Teacher teacher = new Teacher();
		teacher.enterData(reader);
		teacher.printIdCard();
		
		//create an employee file
		Employee employee = new Employee("Hausmeister");
		employee.enterData(reader);
		employee.printIdCard();
		
		//close input reader instance
		reader.close();
	}
}
