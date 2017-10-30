package lecture3;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete chislo:");
		int chislo = sc.nextInt();
		
		boolean prosto = true;
		
		for(int i = 2; i<chislo; i++){
			if(chislo%i == 0){
				prosto = false;
				break;
			}
		}
		
		if(prosto){
			System.out.println("Prosto chislo e "+chislo+"!");
		}
		else{
			System.out.println(chislo+" ne e prosto chislo!");
		}

	}

}
