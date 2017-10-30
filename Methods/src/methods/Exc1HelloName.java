package methods;

import java.util.Scanner;

public class Exc1HelloName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.next();
		helloName(name);
		

	}
	static void helloName (String name){
		System.out.println("Hello "+ name);
	}

}
