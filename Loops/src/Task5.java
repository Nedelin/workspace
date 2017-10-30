import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete purvoto chislo ");
		int chislo1 = sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Vuvedete vtoroto chislo ");
		int chislo2 = sc.nextInt();
		if (chislo1 <= chislo2) {
			for (int i = chislo1; i <= chislo2; i++) {
				System.out.println(i);
			}
		}
		if (chislo2 <= chislo1) {
			for (int j = chislo2; j <= chislo1;j++) {
				System.out.println(j);
			}

		}
	}
}

