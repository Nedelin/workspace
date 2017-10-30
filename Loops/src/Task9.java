import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete purvoto chislo ");
		int chislo1 = sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Vuvedete vtoroto chislo ");
		int chislo2 = sc.nextInt();
		int sum = 0;
		if (chislo1 <= chislo2) {
			for (int i = chislo1; i <= chislo2; i++) {
				System.out.print(i * i + ", ");
				if (i % 3 == 0) {
					System.out.println("Chisloto " + i * i + " se propuska zashtoto se deli na 3!");
				}
				sum = sum + (i * i);
				if (sum > 200) {
					System.out.println("Sumata na chislata e po golqma ot 200!");
					break;
				}
			}
			if (chislo2 <= chislo1) {
				for (int i = chislo2; i <= chislo1; i++) {
					System.out.print(i * i + ", ");
					if (i % 3 == 0) {
						System.out.println("Chisloto " + i * i + " se propuska zashtoto se deli na 3!");
					}
					sum = sum + (i * i);
					if (sum > 200) {
						System.out.println("Sumata na chislata e po golqma ot 200!");
						break;
					}
				}

			}
		}
	}
}

