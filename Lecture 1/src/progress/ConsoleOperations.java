package progress;

import java.util.Scanner;

public class ConsoleOperations {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("a= ");
			int a = scanner.nextInt();
			
			System.out.println("b= ");
			int b = scanner.nextInt();
			
			System.out.println("b + a = " + (a + b));
	}
}
