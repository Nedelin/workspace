package lecture2;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first number - A:");
		int a = input.nextInt();
		System.out.println("Please enter the second numer - B:");
		int b = input.nextInt();
		int help = a;
		a = b;
		b= help;
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		

	}

}
