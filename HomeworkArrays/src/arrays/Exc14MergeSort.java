package arrays;

import java.util.Arrays;

public class Exc14MergeSort {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 1, 12, 16, 112, 1421, 123, 234, 5321, 326, 3, 12, 7213, 8 };
		System.out.println("unsorted numbers = " + Arrays.toString(arr));
		System.out.println("sorted numbers = " + Arrays.toString(mergeSort(arr)));

	}

	public static int[] mergeSort(int array[]) {
		if (array.length > 1) {
			int elementsinA1 = array.length / 2;
			int elementsinA2 = array.length - elementsinA1;

			int[] arr1 = new int[elementsinA1];
			int[] arr2 = new int[elementsinA2];

			for (int i = 0; i < elementsinA1; i++) {
				arr1[i] = array[i];
				for (int j = elementsinA1; j < elementsinA1 + elementsinA2; j++) {
					arr2[j - elementsinA1] = array[j];
				}
			}
			arr1 = mergeSort(arr1);
			arr2 = mergeSort(arr2);

			int indexArr = 0;
			int indexArr1 = 0;
			int indexArr2 = 0;

			while (indexArr1 < arr1.length && indexArr2 < arr2.length) {
				if (arr1[indexArr1] < arr2[indexArr2]) {
					array[indexArr] = arr1[indexArr1];
					indexArr1++;
				} else {
					array[indexArr] = arr2[indexArr2];
					indexArr2++;
				}
				indexArr++;

			}
			while (indexArr1 < arr1.length) {
				array[indexArr] = arr1[indexArr1];
				indexArr++;
				indexArr1++;
			}
			while (indexArr2 < arr2.length) {
				array[indexArr] = arr2[indexArr2];
				indexArr++;
				indexArr2++;
			}

		}

		return array;
	}
}
