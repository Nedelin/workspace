import java.util.Scanner;

public class Task6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1;
		String[] words;
		do {
			System.out.println("Въведете изречение с отделни думи:");
			s1 = sc.nextLine();
			words = s1.split(" ");
		} while (words.length < 2);
		
		s1 = s1.toLowerCase();
		StringBuilder s1B = new StringBuilder(s1);
		int asciiCode = s1B.charAt(0);
		char temp = (char) (asciiCode-32);
		s1B.deleteCharAt(0);
		s1B.insert(0, temp);
		
		for (int i = 0; i < s1B.length(); i++) {
			if (s1B.charAt(i) == ' ') {
				asciiCode = s1B.charAt(i+1);
				temp = (char) (asciiCode-32);
				s1B.deleteCharAt(i+1);
				s1B.insert(i+1, temp);
			}
		}
		
		System.out.println(s1B);
		
	}

}
