package problem1;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int [] arr = {5,4,3,1,10,9};
		int [] sorted = sortedArray(arr);
		System.out.println(Arrays.toString(sorted));
		
		int [] arr2 = {1,21,312,12,12,4,5,1,123,5,6,7,8,34,2,12,1,213,5};

		int[] sorted2 = sortedArray(arr2);
		System.out.println(Arrays.toString(sorted2));
	}

	public static int [] sortedArray(int[] unsortedArray){
		int counter =0;
		for (int i = 0; i<unsortedArray.length -1; i++){
			for(int j = i+1;j<unsortedArray.length;j++){
				counter++;
				if(unsortedArray[i]> unsortedArray[j]){
					int temp = unsortedArray[i];
					unsortedArray[i] = unsortedArray[j];
					unsortedArray[j] = temp;
				}
			}
		}
		System.out.println("Iterations are: " + counter );
		return unsortedArray;
		
	}
}
