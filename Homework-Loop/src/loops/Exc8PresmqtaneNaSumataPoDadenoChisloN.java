package loops;

import java.util.Scanner;

public class Exc8PresmqtaneNaSumataPoDadenoChisloN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Molq vuvedete chisloto N:");
		int n = input.nextInt();
		System.out.println("Molq vuvedete chisloto X");
		int x = input.nextInt();
		int factorial = 1;
		int help = x;
		float sum = 1f;
		for (int i = 1; i <= n; i++) {
			
			factorial = factorial * i;
			sum = sum + (factorial /x);
			x = x*help;
			
		}
		System.out.println(sum);
	}
}
