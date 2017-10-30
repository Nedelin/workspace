package Progress.whileloop;

import java.util.Scanner;

public class WhileLoopPrintNumbersToN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a number");
		int a = input.nextInt();
		int counter = 1;
		while(counter<=a){
			System.out.println(counter);
			counter++;
		}

	}

}
