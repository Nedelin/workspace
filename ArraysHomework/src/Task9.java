import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete goelminata na masiva : ");
		int a = sc.nextInt();
		int[] arr = new int[a];
		System.out.println("Vuvedete chislata v  masiva");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
	}
		int[] arr2 = new int[a];
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=arr[a-i-1];
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
