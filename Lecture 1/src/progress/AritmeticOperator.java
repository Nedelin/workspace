package progress;

public class AritmeticOperator {
	
	public static void main(String[] args) {
		int a = 5;
		int b =10;
		int c = a+b;
		String addOperation = "add operation a+b: ";
		System.out.println(addOperation+c);
		String substractOperation = "subtract operation b-a: ";
		c = b-a;
		System.out.println(substractOperation+c);
		String multiplytOperation = "multiply operation a*b: ";
		c= a*b;
		System.out.println(multiplytOperation+c);
		c = b/a;
		String devisiontOperation = "devision operation b/a: ";
		
		System.out.println(devisiontOperation+c);
		
		
	}

}
