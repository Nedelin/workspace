package arrays;

import java.util.Scanner;

public class PrintMatrixByCols {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number rows of the matrix");
		int rows = input.nextInt();
		System.out.println("Please enter number cols of the matrix");
		int cols = input.nextInt();
		int[][] matrix = new int[rows][cols];
		int currentNumber = 1;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = currentNumber++;
			}
		}

		for (int row = 0; row < matrix.length; row++) {
			for (int col= 0;col < matrix[0].length ;col++) {
				System.out.print(matrix[row][col] + " ");

			}
			System.out.println();
		}
		input.close();
	}
}
