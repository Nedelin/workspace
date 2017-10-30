import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete chislo: ");
		int a = sc.nextInt();
		 int sum=0;
         for(int i=0;i<=a;i++){
             sum=sum+i;
         }
         System.out.println("Rezultata e "+sum);
	}

}
