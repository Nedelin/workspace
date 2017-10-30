package arrays;

import java.util.Scanner;

public class Exc10c {

	public static void main(String[] args) {

		  Scanner scanner = new Scanner(System.in);
		  System.out.println("Insert the size of matrix n*n");
		  int n = scanner.nextInt();
		  int[][] arr = new int[n][n];
		        int counter=1;
		  
		  for(int row=arr.length-1;row>=0;row--) {
		   
		   for(int col=0;col<arr.length-row;col++) {
		    arr[row+col][col]=counter++;
		   }
		   
		  }
		  
		  
		  for(int row=0;row<arr.length-1;row++) {
		   for(int col=1;col<arr.length-row;col++) {
		    arr[col-1][col+row]=counter++;
		   }
		 
		  }
		  
		  
		  for(int row=0;row<arr.length;row++) {
		   for(int col=0;col<arr.length;col++) {
		    System.out.print(arr[row][col]+" ");
		    
		   }
		   System.out.println();
		  }
		  
		  scanner.close();
		 }  

		}
