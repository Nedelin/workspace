import java.util.Scanner;

import javax.print.attribute.standard.NumberUp;

public class Task6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Vuvedi chetiri cifreno chislo.");
        String a = scanner.next();

    
        if (a.length() != 4) {
                System.out.println("Greshno chislo!");
	}
        int b = a.charAt(0) + a.charAt(3);
        int c = a.charAt(1) + a.charAt(2);
        System.out.println(b + ", "+c);
	if(b<c){
		System.out.println(b+"e po malko ot"+c);
	}
		if(b==c){
			System.out.println("Chislata sa ednakvi");
			
		}
		if(b>c){
			System.out.println(b + " e po gomqlo ot"+ c);
		

		}
	}
}

