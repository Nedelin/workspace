package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShowJavaExceptions {

	public static void main(String[] args) {
		int userInput = getUserInput();
		
		if(userInput == -1){
			return;
		}
		showArrayNumberByIndex(userInput);
	}

	private static int getUserInput(){
		Scanner input = new Scanner (System.in);
		int userInput = 0;
		try{
			userInput = input.nextInt();
	
		}
		catch(InputMismatchException e){
			System.out.println("Please enter an integer.");
			return -1;
		}
		return userInput;
	}
	private static void showArrayNumberByIndex(int index){
		try{
		int [] arr = {1,2,3};
		System.out.println(arr[index]);
	}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Please use a valid index of array");
		}
	}
}
