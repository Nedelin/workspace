import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Purvo chislo: ");
		int a = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Vtoro chislo: ");
		int b = sc1.nextInt();
		
		System.out.print("Sumata e: ");
		System.out.println(a+b);
		System.out.print("Razlikata e: ");
		System.out.println(a-b);
		System.out.print("Proizvedenieto e: ");
		System.out.println(a*b);
		System.out.print("Ostatuk ot delenie: ");
		System.out.println(a%b);
		System.out.print("Celochisleno delenie: ");
		System.out.println(a/b);

	}

}
