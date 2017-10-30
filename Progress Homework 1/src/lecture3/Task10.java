package lecture3;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Vuvedete chisloto ot 1000-9999:");
		int number = input.nextInt();
		int a = number/1000;
		int b = number/100%10;
		int c = number/10%10;
		int d = number%10;
		int sum = a+b+c+d;
		System.out.println("Sbora na cifrite e: "+sum );
		System.out.println("Chislata v obraten red sa: "+d+c+b+a);
		System.out.println("Chisloto s poslednata cifra nai otpred: "+d+a+b+c);
		System.out.println("Razmenqme mqstoto na vtorata i tretata cifra "+a+c+b+d);
	}

}
