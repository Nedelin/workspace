package strings;

public class StringExtraction {

	public static void main(String[] args) {
		String text = "Времето навън е супер яко.";
		String outside = text.substring(8);
		System.out.println(text.substring(8, 13));
		System.out.println(outside.substring(0, 5));
	}

}
