package arrays;

import java.util.Scanner;

public class ArrayBiggesAndSmallestNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arrayLenght = input.nextInt();
		int [] masiv = new int [arrayLenght];
		int smaller = 999999;
		int biggest = -999999;
		for(int i = 0; i<=masiv.length-1;i++){
			System.out.println("Vuvedete elementite na masiva");
			masiv[i] = input.nextInt();
		}
		for(int j = 0;j<=masiv.length-1;j++){
			if(masiv[j]>biggest){
				biggest = masiv[j];
			}
			if(masiv[j]<smaller){
				smaller = masiv[j];
			
			}
		}
		System.out.println(smaller);
		System.out.println(biggest);
		

	}

}
