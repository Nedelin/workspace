package lecture3;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Osnovata na trapeca e A:");
		int a = input.nextInt();
		System.out.println("Drugata osnova na trapeca e B:");
		int b = input.nextInt();
		System.out.println("Visochinata na trapeca e H:");
		int h = input.nextInt();
		
		float s = ((a+b)*h)/2f;
		
		System.out.println("Liceto e S: "+s);

	}

}
