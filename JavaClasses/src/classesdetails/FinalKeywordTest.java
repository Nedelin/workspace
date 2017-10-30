package classesdetails;

public class FinalKeywordTest {

	private static final String finalString = "final string";
	public static void main(String[] args) {
		final String test = "This cannot be changed.";
		// final local variables cannot be changed once assigned.
		// test = "new string"

		//final field cannot be changed once assigned.
		// finalString = "new string"
	}

}
