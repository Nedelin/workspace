package lecture4;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete radiusa na okrujnosta");
		int r = input.nextInt();
		
		double p = 2* Math.PI*r;
		double s = Math.PI*r*r;
		System.out.println("Perimetura e: "+p);
		System.out.println("Liceto e: "+s);
	}

}
