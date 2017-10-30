package methods;

import java.util.Scanner;

public class Exc1printName {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name = scanner.next();
		Hello(name);
	}

	static void Hello(String name) {
		System.out.println("Hello " + name);
	}
}
