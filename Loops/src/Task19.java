import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete chislo medju 10 i 99: ");
		int num = sc.nextInt();
		if (num >= 10 && num <= 99) {

			while (num != 1) {
				if (num % 2 != 0) {
					num = num * 3 + 1;
					System.out.print(num + " ");
				}
				if (num % 2 == 0) {
					num = num / 2;
					System.out.print(num + " ");

				}

			}

		}else
			System.out.println("Chisloto ne e v intervala!");
	}
}