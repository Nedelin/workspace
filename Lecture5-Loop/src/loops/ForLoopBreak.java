package loops;

import java.util.Scanner;

public class ForLoopBreak {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int chislo = input.nextInt();
		for (int i = 1;i<=chislo;i++){
			if(i==25){
				break;
			}
			System.out.println(i);
		}

	}

}
