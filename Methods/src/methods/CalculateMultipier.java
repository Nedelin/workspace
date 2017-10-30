package methods;

import java.util.Scanner;

public class CalculateMultipier {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println(multiplyNumbers(a,b));
	}
	static int multiplyNumbers (int a, int b){
		return a * b;
	}

}
