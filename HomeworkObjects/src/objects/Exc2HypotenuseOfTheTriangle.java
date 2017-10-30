package objects;

import java.util.Scanner;

public class Exc2HypotenuseOfTheTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the value for A:");
		int a = input.nextInt();
		System.out.println("Please enter the value for B:");
		int b = input.nextInt();
		double c = a*a + b*b;
		System.out.println("Hypotenuse is :"+Math.sqrt(c));
		

	}

}
