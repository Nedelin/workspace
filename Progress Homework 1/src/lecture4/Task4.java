package lecture4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete purvoto chislo");
		int a = input.nextInt();
		System.out.println("Vuvedete vtoroto chislo");
		int b = input.nextInt();
		if(a>b){
			for(int x = b+1;x<a;x++){
				if (x%5 == 0){
					System.out.println(x);
				}
			}
		}
		if(a<b){
			for (int y =a+1; y<b;y++){
				if (y%5 == 0){
				System.out.println(y);
				}
			}
		}
	}
}
