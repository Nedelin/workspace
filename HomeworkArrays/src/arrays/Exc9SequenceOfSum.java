package arrays;

import java.util.Scanner;

public class Exc9SequenceOfSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the length of the array:");
		int N = input.nextInt();
		System.out.println("Please enter the sum:");
		int K = input.nextInt();
		int[] array = new int[N];
		int sum = 0;
		int sum1 = 0;

		System.out.println("Please enter the numbers in the first array");
		for (int i = 0; i < N; i++) {
			array[i] = input.nextInt();
		}
		for (int i = 0; i < N; i++) {
			sum = array[i];
			for (int j = i + 1; j <= N; j++) {
				if (sum == K) {

					System.out.println("Sum found between " + array[i] + " and " + array[j - 1]);
				}
				if (sum > K || j == N)
					break;
				sum = sum + array[j];
			}

		}

	}

}
