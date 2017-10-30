import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete goelminata na  masiva : ");
		int a = sc.nextInt();
		int[] arr = new int[a];
		
		System.out.println("Vuvedete chislata v  masiva");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
	}
		int[] arr2 = new int[a];
		arr2[0]=arr[0];
		arr2[a-1]=arr[a-1];
		for (int i = 1; i < arr2.length-1; i++) {
			arr2[i]=arr[i-1]+arr[i+1];
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
}
}

