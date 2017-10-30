import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete chislo mejdu 1000 i 9999 ! ");
		int a = sc.nextInt();
		if (a > 9999) {
			System.out.println("Chisloto e po-golqmo ot 9999 !");
		} else {
			if (a < 1000) {
				System.out.println("Chisloto e po-malko ot 1000 !");

			} else {
				int b = 10 * (a / 1000) + a % 10;
				int c = 10 * (a / 100 % 10) + a / 10 % 10;

				if (b > c) {
					System.out.println("po-golqm" + '(' + b + '>' + c + ')');
				}
				if (b < c) {
					System.out.println("po-malko" + '(' + b + '<' + c + ')');
				}
				if (b == c) {
					System.out.println("ravni" + '(' + b + '=' + c + ')');
			} 
		
	}
}
}
}

