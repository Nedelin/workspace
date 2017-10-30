package arrays;

import java.util.Arrays;

public class Exc7SelectionSort {

	public static void main(String[] args) {
		int []masiv = {40, 6 , 5 ,2, 12, 78, 1213, 12, 14, 15,16, 100};
		
		selectionSort(masiv);

		System.out.println(Arrays.toString(masiv));
	}
	static void selectionSort(int [] array){
		for(int sortedCount = 1;sortedCount<array.length;sortedCount ++){
			int maxIndex = 0;
			for(int index = 0; index <=array.length - sortedCount;index++){
				if(array[index]>array[maxIndex]){
					maxIndex = index;
				}
				int temp= array[maxIndex];
				array[maxIndex] = array[array.length-sortedCount];
				array[array.length-sortedCount] = temp;
			}
		}
	}

}
