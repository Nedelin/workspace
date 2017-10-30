package symbolstrings;

import java.util.Scanner;

public class Exc3MakingLowerCaseToUpperCaseIfFindingTag {

	public static void main(String[] args) {
		String text = "We are living in a <upcase>yellow submarine</upcase>." +
                " We don't have <upcase>anythinggg</upcase> else.";

		int index = text.indexOf("<");
		int index2 = text.indexOf(">");
		int index3 = text.indexOf("</");
		String first = text.substring(index2 + 1, index3).toUpperCase();
		index2 = text.indexOf(">", index2 + 1);

		String replaced = text.replace(text.substring(index, index2 + 1), first);

		index = replaced.indexOf("<");
		index3 = replaced.indexOf("</");
		index2 = replaced.indexOf(">", index2 + 1);
		String sec = replaced.substring(index2 + 1, index3).toUpperCase();
		index2 = replaced.indexOf(">", index2 + 1);

		replaced = replaced.replace(replaced.substring(index, index2 + 1), sec);

		System.out.println(replaced);
	}
}
