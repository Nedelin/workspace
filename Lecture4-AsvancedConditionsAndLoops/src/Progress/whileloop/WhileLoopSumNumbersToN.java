package Progress.whileloop;

import java.util.Scanner;

public class WhileLoopSumNumbersToN {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a number to find thhe factorial of all numbers from 1 to this number:");
		int number = scanner.nextInt();
		int counter = 1;
		int sum = 0;
		
		while(counter<=number){
			sum = sum * counter;
			counter++;
			
		}
		
		System.out.println("The sum is: "+sum);

	}

}
