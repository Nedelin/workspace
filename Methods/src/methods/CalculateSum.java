package methods;

import java.util.Scanner;

public class CalculateSum {
// void ne vrushta stoinost
// public kade moje da bude  dostupvan metoda
// static - moje da bude dostupvan bez obekt direktno chrez klasa
// main imeto na metoda ili kakvo tochno pravi metoda
// trqbva da pravi tova koeto e napisano v imeto mu
// Sting[] args kakvi danni priema nashiq metod pod formata na parametri. Moje da nqma parametri. Dobra praktika e da nqma poveche ot 4 parametura zaradi chetimost
//{ } kakvo izvurshva tochno metoda. toi moje da vrushta stoinost ili ne (da e void). Za vrushtane na stoinost se izpolzva return.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 2 numbers to calculate them");
		int c = input.nextInt();
		int d = input.nextInt();
		
		int sum = calculateSum(c,d);
		
		System.out.println("The sum is "+sum);
		input.close();
	}
	
	static int calculateSum(int a, int b){
		return a + b;
	}

}
