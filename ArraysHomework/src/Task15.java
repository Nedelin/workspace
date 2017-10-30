import java.util.Scanner;

public class Task15{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete duljinata na masiva :");
		int num = sc.nextInt();
		double[] arr = new double[num];
		System.out.println("Vuvedete elementite na masiva :");
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextDouble();
		}
		double temp;

		for (int i = 0; i < 3; i++)
			for (int j = i; j < num; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		for (int i = 0; i < 3; i++)
			System.out.println(arr[i]);
	}

}
