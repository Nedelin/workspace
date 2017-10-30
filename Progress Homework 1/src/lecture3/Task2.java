package lecture3;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = input.nextInt();
		if(number%5 == 0 && number%7==0){
			System.out.println("Chisloto se deli bez ostatuk!");
		}if(number%5 == 0 && number%7 != 0){
			System.out.println("Chisloto ne se deli na 7 bez ostatuk");
		}if(number%5 != 0 && number%7 == 0){
			System.out.println("Chisloto ne se deli na 5 bez ostatuk");
		}if(number%5 != 0 && number%7 != 0){
			System.out.println("Chisloto ne se deli nito na 5 nito na 7 bez ostatuk");
		}

	}

}
