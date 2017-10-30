import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete purvoto chislo ot 10 do 5555 ");
		int first = sc.nextInt();
		System.out.println("Vuvedete vtoroto chislo ot 10 do 5555");
		int second = sc.nextInt();
		if(first >5555 || first<10 || second > 5555 || second<10){
			System.out.println("Chisloto ne e v intervala!");// kak da go break ?? primerno ako vaveda first=0 second 100?
		}
		if (first < second) {
			for (int i = second; i >= first; i--) {
				if (i % 50 == 0)
					System.out.println(i);
			}

		}

		if (first > second) {
			for (int i = first; i >= second; i--) {
				if (i % 50 == 0)
					System.out.println(i);
			}

		}

	}

}
