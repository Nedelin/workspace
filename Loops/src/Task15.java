import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete chislo: ");
		int a = sc.nextInt();
	
		 int sum=0;
		 int i =0;
		 do{
			 i++;
			 sum=sum+i;
			 System.out.println(sum);
		 }while(i<a);
        
			 
	}

}
