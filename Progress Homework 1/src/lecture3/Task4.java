package lecture3;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number in range 100-999");
		int number = input.nextInt();
		int help =4;
		if((number&help) != 0){
			System.out.println("3 tiq bit e 1 ca");
		}
		else{
			System.out.println("tretiq bit ne e 1 ca");
		}
		

	}

}
