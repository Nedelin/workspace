package methods;

public class MethodOverloading {

	public static void main(String[] args) {
		String testString = "test";
		int testNumber = 5;
		boolean testBoolean = true;
		
		print(testBoolean);
		print(testNumber);
		print(testString);
	}
	static void print (String test){
		System.out.println(test);
	}
	static void print (int test){
		System.out.println(test);
	}
	static void print(boolean  test){
		System.out.println(test);
	}
}
