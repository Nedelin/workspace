import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete purvoto chislo: ");
		int first = sc.nextInt();
		System.out.println("Vuvedete vtoroto chislo: ");
		int second = sc.nextInt();
		if (first >= 1 && first <= 9 && second >=1&& second <= 9) {
			for (int i = 1; i <= first; i++)
				for (int j = 1; j <= second; j++) {
					System.out.println(i + "*" + j + "=" + i * j);
				}
		} else
			System.out.println("Chisloto ne e v intervala ot 1 do 9");

	}
}