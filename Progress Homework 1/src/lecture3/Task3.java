package lecture3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number in range 100-999");
		int number = input.nextInt();
		int help = 0;
		help = number/100;
		help = help%10;
		if (help == 7){
			System.out.println("Chisloto se deli na 7");
		}
		else
			System.out.println("Chisloto ne se deli na 7");
	}

}
