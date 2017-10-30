import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete chisloto a ");
		int a= sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Vuvedete chislo b ");
		int b= sc.nextInt();
		if((a>99 || a<10) || (b>99 || b<10)){
			System.out.println("Greshen vhod");
			
		}
		int c = a*b;
		if(c%2==0){
			System.out.println(c+", "+c%10+" chetna.");
		}else{
			System.out.println(c+", "+c%10+" nechetna.");
		}
	}

}
