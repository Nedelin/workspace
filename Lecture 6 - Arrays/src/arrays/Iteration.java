package arrays;

public class Iteration {

	public static void main(String[] args) {
		int [] arrays = {1,2,3,4,5,6};
		
		for(int i = 0; i<arrays.length;i++){
			System.out.println(arrays[i]);
		}
		System.out.println();
		for(int value: arrays){
			System.out.println(value);
		}
	}

}
