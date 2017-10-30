package methods;

public class CalculateSumOfArrayElements {

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("The sum is " + calculateSumOfArrayElements(array));

	}
	static int calculateSumOfArrayElements (int [] a){
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

}
