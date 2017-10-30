import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete duljinata na masiva:");
		int num = sc.nextInt();
		double[] arr = new double[num];
		System.out.println("Vuvedete elemntite na masiva :");
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextDouble();
		}
		double[] arr2 = new double[100];
		int index = 0;
		for (int i = 0; i < num; i++) {
			if (arr[i] < 3 && arr[i] > -3) {
				arr2[index] = arr[i];
				index++;
			}
		}
		for (int i = 0; i < index; i++) {
			System.out.println(arr2[i]);
		}
	}

}
