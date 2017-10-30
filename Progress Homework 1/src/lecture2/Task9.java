package lecture2;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your first name?");
		String firstName = input.nextLine();
		System.out.println("What is your last name?");
		String lastName = input.nextLine();
		System.out.println("How old are you?");
		int age = input.nextInt();
		System.out.println("What is your gander?");
		char gander = input.next().charAt(0);
		System.out.println("What is your ID?");
		int id = input.nextInt();
		System.out.println("What is your unique number?");
		int unique = input.nextInt();
		

	}

}
