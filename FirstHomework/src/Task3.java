import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Purvo chislo: ");
		int a = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Vtoro chislo: ");
		int b = sc1.nextInt();

		a = a ^ b ^ (b = a);
	    System.out.println("Novata stoinost na purvoto chislo e "+ a + ",a na vtoroto chislo e " + b);
	}

}
