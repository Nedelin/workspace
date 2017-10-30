import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете ден: ");
		int day = sc.nextInt();
		System.out.println("Въведете месец: ");
		int month = sc.nextInt();
		System.out.println("Въведете година: ");
		int year = sc.nextInt();
		if (day < 31 && month != 2 && month != 4 && month != 6 && month != 9 && month != 11) {
			System.out.println((day + 1) + " " + month + " " + year);
		}

		if (day == 31 && month != 2 && month != 4 && month != 6 && month != 9 && month != 11) {
			if (month == 12) {
				System.out.println((1 + "  " + 1 + "  " + (year + 1)));
			} else
				System.out.println(1 + "  " + (month + 1) + "  " + year);

		}
		if (day < 30 && month != 2 && month != 1 && month != 3 && month != 5 && month != 7 && month != 8 && month != 10
				&& month != 12) {
			System.out.println((day + 1) + " " + month + " " + year);
		}
		if (day == 30 && month != 2 && month != 1 && month != 3 && month != 5 && month != 7 && month != 8 && month != 10
				&& month != 12) {
			System.out.println(1 + "  " + (month + 1) + "  " + year);
		}
		if (day == 28 && month == 2 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
			System.out.println(29 + " " + month + " " + year);
		}
		if (day == 28 && month == 2 && ((year % 400 != 0) || (year % 4 != 0 && year % 100 != 0))) {
			System.out.println(1 + " " + (month + 1) + " " + year);
		}
		if (day < 28 && month == 2)
			System.out.println((day + 1) + "  " + month + " " + year);

}
}
