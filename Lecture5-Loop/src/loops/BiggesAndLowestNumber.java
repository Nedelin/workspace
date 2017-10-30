package loops;

import java.util.Scanner;

public class BiggesAndLowestNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your 10 numbers");
		
		int min = 0;
		int max = 0;
		for(int i = 1;i<=10;i++){
			int current = input.nextInt();
			if(i==1){
				min = current;
				max = current;
			}
			if(current < min){
				min=current;
			}
			if(current>max){
				max = current;
			}
		}
		System.out.println("Your minimun numer is :"+min);
		System.out.println("Your maximum nubers is :"+max);
	}

}
