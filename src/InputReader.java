/**
 * Helper Class for reading user input throughout the program
 */
import java.util.*;
public class InputReader {
	public Scanner scanner; //TODO make private
	
	public void open() {
		this.scanner = new Scanner(System.in);
	}
	
	public void close() {
		this.scanner.close();
	}
	
	public String scanString() {
		return this.scanner.nextLine();
	}
}
