import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete chislo: ");
		int a = sc.nextInt();
		int help=a;
		int br=0;
		
		while(a!=0){
			a=a/2;
			br++;
		}
		
		int[] arr=new int[br];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=help%2;
			help=help/2;
			
		}
		for (int i = arr.length-1; i > -1; i--) {
			System.out.println(arr[i]);
		}
	}
}
