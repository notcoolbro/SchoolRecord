
public class Main {

	public static void main(String[] args) {

		InputReader reader = new InputReader();
		reader.open();
		
//		Student student = new Student();
//		
//		student.enterData(reader);
//		student.printId();
		
//		Teacher teacher = new Teacher();
//		teacher.enterData(reader);
//		teacher.printIdCard();
		
		Employee employee = new Employee("Hausmeister");
		employee.enterData(reader);
		employee.printIdCard();
		
		reader.close();
	}
}
