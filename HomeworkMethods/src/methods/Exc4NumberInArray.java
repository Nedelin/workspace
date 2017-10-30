package methods;

import java.util.Scanner;

public class Exc4NumberInArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the length of the array:");
		int arrayLenght = input.nextInt();
		int[] array = new int[arrayLenght];

		System.out.println("Please enter the numbers in the array:");
		for (int i = 0; i < arrayLenght; i++) {
			array[i] = input.nextInt();

		}
		System.out.println("Please enter the number you want to find:");
		int N = input.nextInt();
		System.out.println(numberArray(array, N));

	}

	static int numberArray(int[] array, int n) {
		int counter = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == n) {
				n = array[i];

			}
			if (n == array[i + 1]) {
				counter++;
			}
		}
		return counter;

	}
}