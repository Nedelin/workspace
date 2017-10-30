package symbolstrings;

import java.util.Scanner;
public class Exc2CountingWordsInText {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the text ");
		String text = scanner.nextLine();
		System.out.println("Please enter the word you need to find");
		String word = scanner.nextLine();
		int lastIndex = 0;
		int count = 0;

		while(lastIndex != -1){

		    lastIndex = text.indexOf(word,lastIndex);

		    if(lastIndex != -1){
		        count ++;
		        lastIndex += word.length();
		    }
		}
		System.out.println(count);
	}
}