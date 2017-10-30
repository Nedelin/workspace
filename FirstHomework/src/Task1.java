import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Purvo chislo: ");
		double a = sc.nextDouble();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Vtoro chislo: ");
		double b = sc1.nextDouble();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Treto chislo: ");
		double c = sc2.nextDouble();
			if (a < b && b < c)
	        {
	            System.out.println("Chisloto "+c+" ne e mejdu "+a+" i "+b);
	        }
			if(a<b&& a>c)
				System.out.println("Chisloto "+c+" ne e mejdu "+b+" i "+a);
			if(a<b && b>c){
				System.out.println("Chisloto "+c+" e e mejdu "+b+" i "+a);
			}
			if((a>b && b>c)){
				System.out.println("Chisloto "+c+" ne e mejdu "+a+" i "+b);
			}
			if(a>b && b<c){
				System.out.println("Chisloto "+c+" e mejdu "+a+" i "+b);
			}
			if(a==b && b==c){
				System.out.println("Chislata sa ednakvi.");
			}
			if(a==b && b<c)
				System.out.println("Chisloto " +c+ " e po golqmo i ot dvete chisla "+a+" "+b);
			if(a==b && b>c)
				System.out.println("Chisloto " +c+ " e po malko i ot dvete chisla "+a+" "+b);
	}
}
