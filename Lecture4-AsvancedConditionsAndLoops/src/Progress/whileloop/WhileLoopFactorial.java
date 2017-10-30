package Progress.whileloop;

import java.util.Scanner;

public class WhileLoopFactorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a number to find factorial:");
		int number = scanner.nextInt();
		int counter = 1;
		int factorial = 1;
		
		while(counter<=number){
			factorial = factorial * counter;
			counter++;
			
		}
		
		System.out.println("The factorial is: "+factorial);

	}
}
