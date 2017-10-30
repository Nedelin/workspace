package lecture2;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Are you a male?");
		boolean isMale= input.nextBoolean();
		
		if(isMale){
			System.out.println("Your gander is male");
		}else{
			System.out.println("Your gander is female");
		}

	}

}
