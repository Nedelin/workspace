package arrays;

import java.util.Arrays;

public class Exc13BinarySearch {

	public static void main(String[] args) {
		int[] array = new int[15];

		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		int x = 12;
		System.out.println(Arrays.toString(array));

		int index = binarySearch(array, x, 0, array.length - 1);
		System.out.println(index);
	}

	public static int binarySearch(int[] arr, int x, int start, int end) {
		int mid = (end + start) / 2;
		if (start > end) {
			return -1;
		}
		if (x == arr[mid]) {
			return mid;
		}
		if (x < arr[mid]) {
			return binarySearch(arr, x, start, mid = 1);
		}
		if (x > arr[mid]) {
			return binarySearch(arr, x, mid + 1, end);
		}
		return -1;
	}

}
