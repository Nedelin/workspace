package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SymetricArray {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.println("Kolko shte e dulug masiva");
		int arrayLength = input.nextInt();
		int[] masiv = new int[arrayLength];
		int[] masiv2 = new int[arrayLength];
		int help = 0;
		for(int i = 0; i<=arrayLength-1;i++){
			System.out.println("Vuvedete chislata na masiva");
			masiv[i] = input.nextInt();
		}
		for(int x=masiv.length-1;x>=0;x--){
			masiv2[help] = masiv[x];
			help++;
		}
		if(Arrays.equals(masiv,masiv2)){
			System.out.println("Simertic");
		}
		else{
			System.out.println("Not symetric");
		}
	}
	

}
