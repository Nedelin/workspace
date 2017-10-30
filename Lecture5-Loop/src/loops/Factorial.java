package loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter your N number:");
		int firstNum = input.nextInt();
		System.out.println("Please enter your K number:");
		int secondNum = input.nextInt();
		
		int firstNumFac = 1;
		int secondNumFac =1;
		int devisionOfFactorial = 0;
		
		for(int i = 1;i<=firstNum;i++){
			firstNumFac = firstNumFac*i;
		}
		for (int j = 1;j<=secondNum;j++){
			secondNumFac = secondNumFac *j;
		}
		System.out.println("First factorial is: "+ firstNumFac);
		System.out.println("Second factorial is: "+ secondNumFac);
		System.out.println("Devision of two factorials is: "+firstNumFac/secondNumFac);
	}

}
