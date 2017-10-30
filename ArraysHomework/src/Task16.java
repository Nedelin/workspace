
public class Task16 {

	public static void main(String[] args) {
		double[] arr = { -1.12, -2.43, 3.1, 4.2, 0, 6.4, -7.5, 8.6, 9.1, -4 };
		double[] arr2 = new double[10];
		for (int i = 0; i < 10; i++) {
			if (arr[i] < -0.231) {
				arr2[i] = (i + 1) * (i + 1) + 41.25;
			} else
				arr2[i] = arr[i] * (i + 1);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(arr2[i]);
		}

	}

}