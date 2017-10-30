package arrays;

import java.util.Arrays;

public class ArrayMultiplied {

	public static void main(String[] args) {
		int[] array ={1,2,3,4,5,6,7,8,9,10};
		int [] array2 = new int[10];
		
		for(int i =0;i<=array.length-1;i++){
			array2[i] = array[i]*2;
			System.out.println(Arrays.toString(array2));
		}

	}

}
