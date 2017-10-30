import java.util.Scanner;

public class Task5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете първата дума:");
		String s1 = sc.next();
		System.out.println("Въведете втората дума:");
		String s2 = sc.next();
		
		int s1Index = 0;
		int s2Index = -1;
		boolean sameChar = false;
		
		for (int i = 0; i < s1.length(); i++) {
			s1Index = i;
			s2Index = s2.indexOf(s1.charAt(i));
			if (s2Index != -1) {
				sameChar = true;
				break;
			}
		}
		
		if ( !(sameChar) ) {
			System.out.println("В думите няма един и същи знак.");
		} else {
			for (int i = 0; i < s2.length(); i++) {
				if (i != s2Index) {
					for (int j = 0; j < s1Index; j++) {
						System.out.print(" ");
					}
				}
				if (i == s2Index) {
					System.out.println(s1);
				} else {
					System.out.println(s2.charAt(i));
				}
			}
		}
		
	}

}
