package methods;

import java.util.Scanner;

public class PrintLogo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the logo of your academy");
		String academyLogo = input.next();
		printLogo(academyLogo);
		input.close();

	}
	static void printLogo (String logo){
		System.out.println(logo);
	}

}
