package methods;

import java.util.Scanner;

public class Exc2MaxFrom3Numbers {

	public static void main(String[] args) {
		System.out.println(findingMaxNumbers());
	}
	static int findingMaxNumbers(){
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter 3 numbers");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		return findMaxNumber(a,b,c);
		
	}
	static int findMaxNumber (int a, int b, int c){
		int maxNumber = a;
		
		if(b>maxNumber){
			maxNumber = b;
		}
		if(c>maxNumber){
			maxNumber = c;
		}
		return maxNumber;
	}
}
