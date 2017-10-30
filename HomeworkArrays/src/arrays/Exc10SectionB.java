package arrays;

import java.util.Scanner;

public class Exc10SectionB {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number rows of the matrix");
		int rows = input.nextInt();
		System.out.println("Please enter number cols of the matrix");
		int cols = input.nextInt();
		int[][] matrix = new int[rows][cols];
		int current = 1;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				
				if(row == 0 && row%2 == 0){
					matrix[col][row] = current++; 
				}
				}
			}
		}

	}


