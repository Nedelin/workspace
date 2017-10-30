package methods;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete purvoto chislo");
		int a = input.nextInt();
		System.out.println("Vuvedete vtoroto chislo");
		int b = input.nextInt();
		System.out.println("Vuvedete znak spored tova koe deistvie iskate da izpulnite");
		String c =input.next();	
		System.out.println(processCalculation(c,a,b));
	}
	static int subirane (int a, int b){
		return a+b;
	}
	static int izvajdane (int a, int b){
		return a-b;
	}
	static int umnojenie (int a, int b){
		return a*b;
	}
	static int delenie (int a, int b){
		return a/b;
	}
	static int processCalculation (String c, int a, int b){
		if(c.equals("+")){
			return subirane(a,b);
		}
		if(c.equals("-")){
			return izvajdane(a,b);
		}
		if(c.equals("*")){
			return umnojenie(a,b);
		}
		if(c.equals("/")){
			return delenie(a,b);
		}else{
			return 0;
		}
		
		
	}
	


}
