package lecture3;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vyvedete stranata na pravoygalnik");
		int strana = input.nextInt();
		System.out.println("Vyvdete negovata visochina");
		int visochina = input.nextInt();
		
		int p = 2*strana + 2*visochina;
		int s = strana*visochina;
		System.out.println("Liceto e S: " +s);
		System.out.println("Perimetura e P: " +p);

	}

}
