import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Task3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String s1;
		String s2;
		boolean thereIsSpace;
		
		do {
			System.out.println("Въведете редица от символи без интервали:");
			s1 = sc.nextLine();
			thereIsSpace = false;
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) == ' ') {
					thereIsSpace = true;
					break;
				}
			}
		} while (s1.length() < 2 || thereIsSpace);
		
		do {
			System.out.println("Въведете втора редица от символи без интервали:");
			s2 = sc.nextLine();
			thereIsSpace = false;
			for (int i = 0; i < s2.length(); i++) {
				if (s2.charAt(i) == ' ') {
					thereIsSpace = true;
					break;
				}
			}
		} while (s2.length() < 2 || thereIsSpace);
		
		boolean isDifferent = false;
		
		if (s1.length() == s2.length()) {
			System.out.println("Двата низа са с равна дължина.");
		} else {
			System.out.println("Двата низа са с различна дължина.");
			isDifferent = true;
		}
		
		System.out.println("Разлика по позиции:");
		
		if (s1.length() >= s2.length()) {
			for (int i = 0; i < s2.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					System.out.print( (i+1) + " " + s1.charAt(i) + "-" + s2.charAt(i));
					System.out.println();
					isDifferent = true;
				}
			}
			for (int i = s2.length(); i < s1.length(); i++) {
				System.out.print( (i+1) + " " + s1.charAt(i) + "- няма буква");
				System.out.println();
			}
		} else {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					System.out.print( (i+1) + " " + s1.charAt(i) + "-" + s2.charAt(i));
					System.out.println();
					isDifferent = true;
				}
			}
			for (int i = s1.length(); i < s2.length(); i++) {
				System.out.print( (i+1) + " няма буква-" + s2.charAt(i));
				System.out.println();
			}
		}
		
		if ( !(isDifferent) ) {
			System.out.println("няма");
		}
		
	}

}