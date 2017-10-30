package loops;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter number:");
		int n = input.nextInt();
		
		int sum = 0;
		int secondNum = 1;
		int firstNum = 0;
		int realSum = 1;
		for (int i = 1; i<n-1;i++){
			sum = firstNum+secondNum;
			firstNum = secondNum;
			secondNum = sum;
			realSum = realSum +sum;
		}
		System.out.println(realSum);
	}

}
