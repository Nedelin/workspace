package classesdetails;

public class FieldAndLocalVarExample {

	//this is a field
	private static int b =6;
	public static void main(String[] args) {
		
		System.out.println(b);
		testLocalVariable();
	}

	private static void testLocalVariable (){
		// this is local variable
		int a =5;
		System.out.println(a);
	}
}
