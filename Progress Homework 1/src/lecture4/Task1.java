package lecture4;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete purvoto chislo");
		int a = input.nextInt();
		System.out.println("Vuvedete vtoroto chislo");
		int b = input.nextInt();
		System.out.println("Vuvedete tretoto chislo");
		int c = input.nextInt();
		int sum = a+b+c;
		System.out.println("Sumata na chislata e: "+sum);

	}

}
