package methods;

import java.util.Scanner;

public class CheckIfNumberIsPositive {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter your number");
		int number = input.nextInt();
		System.out.println(ifNumerIsPositive(number));

	}
	static String ifNumerIsPositive (int n){
		String positive = "Positive";
		String zero = "Zero";
		String negative = "Negative";
		if(n>0){
			return "Positive";
		}
		if(n<0){
			return negative;
		}
		if(n==0){
			return zero;
		}else{
			return "Invalid number";
		}
	}
}
