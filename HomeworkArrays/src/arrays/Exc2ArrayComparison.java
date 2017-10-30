package arrays;

import java.util.Scanner;

public class Exc2ArrayComparison {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the lenght of the first array");
		int firstArray = input.nextInt();
		System.out.println("Please enter the lenght of the second array");
		int secondArray = input.nextInt();
		int[] arr1 = new int [firstArray];
		int[] arr2 = new int [secondArray];
		int counter = 0;
		if(firstArray != secondArray){
			System.out.println("They are not equals");
		}
		else{
			for (int i = 0; i < arr1.length; i++) {
				System.out.println("Please enter the numbers in the first array");
				arr1[i] = input.nextInt();
			}
			for (int j = 0; j < arr2.length; j++) {
				System.out.println("Please enter the numbers in the second  array");
				arr2[j] = input.nextInt();
			}
			for (int z = 0; z < arr2.length; z++) {
				if(arr1[z]==arr2[z]){
					counter++;
				}
			}
			if(counter == firstArray){
				System.out.println("They are equals");
			}
		}
	}
}
