package lecture3;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Kolko kilograma tejite?");
		int kilogrami = input.nextInt();
		float help = kilogrami*17/100f;
		System.out.println("Na lunata shte tejite: "+help+"kg");

	}

}
