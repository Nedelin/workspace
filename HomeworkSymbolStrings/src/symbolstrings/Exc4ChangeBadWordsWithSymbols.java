package symbolstrings;

import java.util.Scanner;

public class Exc4ChangeBadWordsWithSymbols {

	public static void main(String[] args) {
		 
		Scanner input=new Scanner(System.in);
		System.out.print("Въведете текста: ");
		String  text=input.nextLine();
 
		System.out.println();
		System.out.println("Въведете забранените думи с разделител запетая!");
		String prohibitedWords=input.nextLine();
 
		String[] prohibitedWordsArr=prohibitedWords.split("[,]");
		String result=text;
		String x;//Присвоява и се всяка забранена дума в масива
 
		for(int i=0; i <= prohibitedWordsArr.length-1;i++){
			x=prohibitedWordsArr[i];
			result=result.replaceAll(x,"***");
		}
		
		System.out.println(result);
	}
}

