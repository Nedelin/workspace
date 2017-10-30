package methods;

import java.util.Scanner;

public class Exc5ElementInArray {

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
		findsElement(array, N);

	}

	static void findsElement(int[] array, int n) {
		int leftNum = 0;
		int rightNum = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == n) {
				n = array[i];
				leftNum = array[i - 1];
				rightNum = array[i + 1];
			}
		}
		if (n > leftNum) {
			System.out.println(n + " is bigger than the number " + leftNum);
		} else {
			System.out.println(n + " is smaller than the number " + leftNum);
		}
		if (n > rightNum) {
			System.out.println(n + " is bigger than the number " + rightNum);
		} else {
			System.out.println(n + " is smaller than the number " + rightNum);
		}

	}
}