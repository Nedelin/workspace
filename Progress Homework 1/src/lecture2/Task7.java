package lecture2;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete stranata na trugalnika!");
		int rows = input.nextInt();
		int x = 1;
		int y = rows;
		for (int l = 0; l < rows - 1; l++) {

			for (int s = 0; s < y - 1; s++) {
				System.out.print(" ");
			}

			for (int s = 0; s < x; s++) {
				if (s == 0 || s == x - 1) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}

			System.out.println();
			x += 2;
			y--;
		}

		for (int s = 0; s < (rows * 2) - 1; s++) {
			System.out.print("*");
		}

	}

}
