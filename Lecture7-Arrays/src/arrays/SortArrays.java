package arrays;

import java.util.Scanner;

public class SortArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arrayLenght = input.nextInt();
		int[] masiv = new int[arrayLenght];
		int help = 0;

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
		for (int k = masiv.length - 1; k >= 0; k--) {
			System.out.println(masiv[k]);
		}

	}
}

