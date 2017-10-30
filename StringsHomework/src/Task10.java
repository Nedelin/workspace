import java.util.Scanner;

public class Task10 {
public static void main(String[] args) {
		System.out.println("Vuvedi dumata");
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		for (int letterIndex = 0; letterIndex < word.length(); letterIndex++) {
			char newLetter = (char) (word.charAt(letterIndex) + 5);
			System.out.print(newLetter);
		}
		System.out.println();
		sc.close();
	}
}