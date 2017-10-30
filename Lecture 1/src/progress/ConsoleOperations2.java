package progress;

import java.util.Scanner;

public class ConsoleOperations2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your first name");
		String firstName = scanner.nextLine();
		
		System.out.println("Please entre your second name");
		String secondName = scanner.nextLine();
		
		System.out.println("Your name is: "+firstName + " "+ secondName);
	}

}
