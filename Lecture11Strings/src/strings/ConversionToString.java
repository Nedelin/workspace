package strings;

public class ConversionToString {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		boolean yes = true;
		
		String aAsString = String.valueOf(a);
		String yesAsString = String.valueOf(yes);
		System.out.println(aAsString);
		System.out.println(yesAsString);
		
		String number = "365";
		String no = "false";
		int numberAsInteger = Integer.parseInt(number);
		boolean noAsBoolean = Boolean.parseBoolean(no);
		
		System.out.println(numberAsInteger +100);

	}

}
