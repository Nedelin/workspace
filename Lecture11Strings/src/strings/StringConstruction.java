package strings;

public class StringConstruction {

	public static void main(String[] args) {
		String collectors = "Numbers: ";
		
		for (int i = 1; i < 1000; i++) {
			collectors+=i;
		}
		System.out.println(collectors);
	}

}
