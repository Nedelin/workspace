package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exc2CountingWords {

	public static void main(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the text ");
		String text = scanner.nextLine();
		System.out.println("Please enter the word you need to find");
		String word = "hi";
		int counter = 0;
		char[] tempCharArray = new char[text.length()];
		char[] charArray = new char[text.length()];


		System.out.println(tempCharArray);

	}

}
