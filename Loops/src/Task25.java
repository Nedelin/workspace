import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete chislo: ");
		int a = sc.nextInt();

		 int i=1;
		 int fact=1;
		 do{
			 i++;
			 fact*=i;
			 System.out.println(fact);
		 }while(i<a);
        
	}

}
