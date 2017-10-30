
public class Task2 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 6, 8, -3 };
		int[] arr2 = new int[arr.length];
		int k = arr.length / 2;
		for (int i = 0; i < arr.length / 2; i++) {
			arr2[i] = arr[i];

		}
		
		for (int j = arr.length / 2-(1); j > -1; j--) {
			arr2[k] = arr[j];
			k++;
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
