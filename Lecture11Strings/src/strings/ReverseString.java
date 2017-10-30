package strings;

public class ReverseString {

	public static void main(String[] args) {
		String text = "This is the text i want to reverse.";
		StringBuilder builder = new StringBuilder(text);
		String reversedText = builder.reverse().toString();
		
		System.out.println(reversedText);

	}

}
