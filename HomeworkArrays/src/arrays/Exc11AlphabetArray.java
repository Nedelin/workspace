package arrays;

import java.util.Scanner;

public class Exc11AlphabetArray {

	public static void main(String[] args) {
		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter word:");
		String word = input.next();
		int index = 0;
		
		int counter = 1;
		char[] charArray = word.toCharArray();
		for (char y = 0; y <= alphabet.length - 1; y++) {
			for (char i = 0; i <= charArray.length - 1; i++) {
				if (alphabet[y] == charArray[i]) {
					index = y;
					counter ++;
					System.out.println(index);
				}

			}

		}
	}
}