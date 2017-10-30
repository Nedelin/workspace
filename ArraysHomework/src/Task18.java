import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Vuvedete elementite na purviq masiv:");
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		int[] arr2 = new int[10];
		System.out.println("Vuvedete elemntite na vtoriq masiv:");
		for (int i = 0; i < 10; i++) {
			arr2[i] = sc.nextInt();
		}
		int[] arr3 = new int[10];
		for (int i = 0; i < 10; i++) {
			if (arr[i] >= arr2[i]) {
				arr3[i] = arr[i];
			} else
				arr3[i] = arr2[i];
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(arr3[i]);
		}
	}
}