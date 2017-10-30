import java.util.Scanner;

public class Task7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1;
		String[] words;
		do {
			System.out.println("Въведете набор от думи, разделени с интервал:");
			s1 = sc.nextLine();
			words = s1.split(" ");
		} while (words.length < 2);
		
		int symbols = words[0].length();
		
		for (int i = 1; i < words.length; i++) {
			if (words[i].length() > words[i-1].length()) {
				symbols = words[i].length();
			}
		}
		System.out.println(words.length + " думи, най-дългата е с " + symbols + " символа.");
		
	}

}
