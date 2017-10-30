import java.util.Scanner;

public class Task2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете последователно две думи с дължина 10-20 знака.");
		String word1;
		String word2;
		do {
			System.out.println("Въведете първата дума:");
			word1 = sc.next();
		} while (word1.length() < 10 || word1.length() > 20);
		
		do {
			System.out.println("Въведете втората дума:");
			word2 = sc.next();
		} while (word2.length() < 10 || word2.length() > 20);
		
		if (word1.length() > word2.length()) {
			System.out.println(word1.length());
		} else {
			if (word1.length() < word2.length()) {
				System.out.println(word2.length());
			} else {
				System.out.println("Думите са с еднаква дължина.");
			}
		}
		
		System.out.println(word2.substring(0, 5) + word1.substring(5));
		System.out.println(word1.substring(0, 5) + word2.substring(5));
		
	}

}
