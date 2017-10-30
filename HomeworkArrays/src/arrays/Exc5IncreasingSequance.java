package arrays;

import java.util.Scanner;

public class Exc5IncreasingSequance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arrayLenght = input.nextInt();
		int[] masiv = new int[arrayLenght];
		int help = 0;
		int counter = 0;
		int max = 0;
		int number = 0;
		for (int i = 0; i <= masiv.length - 1; i++) {
			System.out.println("Vuvedete elementite na masiva");
			masiv[i] = input.nextInt();
		}
		for (int i = 0; i < masiv.length-1; i++) {
			help = masiv[i]+1;
			if(help  == masiv[i+1]){
				counter++;
			}
			if (help != masiv[i+1]){
				counter = 0;
			}
			if (counter > max){
				max = counter+1;
				number = masiv[i]+1;
			}
		}
		System.out.print("Redicata e ");
		for (int i = 0; i<=max;i++){
			System.out.print(number-(max-1) + " ");
			number++;
		}
		input.close();
	}

}
