import java.util.Scanner;

public class Task4 {

public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Purvo chislo: ");
	int a = sc.nextInt();
	
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Vtoro chislo: ");
	int b = sc1.nextInt();
	if (a<b){
		System.out.println(a+", "+b);
		
	}
	else{
		System.out.println(b+", "+a);
	}
	if (a==b){
		System.out.println("chislata sa ednakvi");
	}

	}

}
