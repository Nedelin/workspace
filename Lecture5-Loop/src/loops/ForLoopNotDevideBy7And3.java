package loops;

import java.util.Scanner;

public class ForLoopNotDevideBy7And3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int userInput = input.nextInt();
		
		for(int i=0; i<=userInput;i++){
			if(!(i%3==0 || i%7 ==0)){
				System.out.println(i);
			}
		}

	}

}
