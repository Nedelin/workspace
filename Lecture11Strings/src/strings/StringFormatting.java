package strings;

public class StringFormatting {

	public static void main(String[] args) {
		String msg = "Stand up, Stand up, Balkan superman";
		System.out.printf("msg = \"%s\"%n", msg);
		System.out.printf("msg.length() = %d%n", msg.length());
		
		char [] charArray = msg.toCharArray();
		
		int length = charArray.length;
		
		System.out.println(length);
		
	}

}
