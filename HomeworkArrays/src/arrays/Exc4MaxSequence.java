package arrays;

import java.util.Scanner;

public class Exc4MaxSequence {

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

		for (int i = 0; i <= masiv.length - 1; i++) {
			for (int j = i; j <= masiv.length - 1; j++) {
				if (masiv[i] < masiv[j]) {
					help = masiv[i];
					masiv[i] = masiv[j];
					masiv[j] = help;
				}
			}

		}
		for (int i = 0; i < masiv.length-1; i++) {
			if (masiv[i] == masiv[i+1]){
				counter ++;
			}
			if (masiv[i]!= masiv[i+1]){
				counter = 0;
			}
			if (counter > max){
				max = counter;
				number = masiv[i];
			}
		}
		System.out.print("Redicata e ");
		for(int i =0;i<max+1;i++){
			
			System.out.print(number+" ");
		}
		input.close();
	}
}
