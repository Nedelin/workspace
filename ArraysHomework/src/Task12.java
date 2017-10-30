import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete chislata v masiva : ");
		int[] arr = new int[7];
		for (int i = 0; i < 7; i++) {
			arr[i] = sc.nextInt();
		}
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		arr[2] = arr[2] + arr[3];
		arr[3] = arr[2] - arr[3];
		arr[2] = arr[2] - arr[3];
		arr[4] = arr[4] * arr[5];
		arr[5] = arr[4] / arr[5];
		arr[4] = arr[4] / arr[5];

		for (int i = 0; i < 7; i++) {
			System.out.print(arr[i] + "; ");
		}

	}

}