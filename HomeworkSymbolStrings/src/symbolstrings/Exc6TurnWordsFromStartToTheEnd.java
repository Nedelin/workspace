package symbolstrings;

public class Exc6TurnWordsFromStartToTheEnd {

	public static void main(String[] args) {
		String line = "C# is not C++ and PHP is not Delphi";
		String lastWord = line.substring(line.lastIndexOf(" ")+1);
		line.replace(lastWord,"");
		System.out.println(line);
	}
}
