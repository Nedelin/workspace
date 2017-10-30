package methods;

public class FindMaxNumber {

	public static void main(String[] args) {
		int maxNumber = findMaxNumber(-4,-2,-100,200);
		System.out.println("Max number is "+ maxNumber);

	}
	static int findMaxNumber (int ... elements){
		int maxNumber = elements[0];
		
		for( int element:elements){
			if (maxNumber <element){
				maxNumber = element;
			}
		}
		return maxNumber;
	}

}
