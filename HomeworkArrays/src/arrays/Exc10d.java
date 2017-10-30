package arrays;

import java.util.Scanner;

public class Exc10d {

	public static void main(String[] args) {

		  System.out.print("Enter arr size: ");

		  Scanner sc = new Scanner(System.in);
		  int length = sc.nextInt();
		  sc.close();
		  int[][] arr = new int[length][length];
		  int numConcentricSquares = length % 2 == 0 ? length / 2 : length / 2 + 1;

		  int sideLen = length;
		  int currNum = 0;

		  for (int i = 0; i < numConcentricSquares; i++) {
		                 // down
		   for (int j = 0; j < sideLen; j++)
		    arr[i + j][i] = ++currNum;
		                // right
		   for (int j = 1; j < sideLen - 1; j++)
		    arr[length - 1 - i][i + j] = ++currNum;
		               // up
		   for (int j = sideLen - 1; j > 0; j--)
		    arr[i + j][length - 1 - i] = ++currNum;
		               // left
		   for (int j = sideLen - 1; j > 0; j--)
		    arr[i][i + j] = ++currNum;

		   sideLen -= 2;
		  }

		  for (int i = 0; i < arr.length; i++) {
		   for (int j = 0; j < arr[i].length; j++)
		    System.out.printf(" %3d ", arr[i][j]);
		   System.out.println();
		  }
		 }
		}