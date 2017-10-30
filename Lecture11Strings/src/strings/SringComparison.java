package strings;

public class SringComparison {

	public static void main(String[] args) {
		String Petyr = "Petyr";
		String Misho = "Petyr";
		
		System.out.println(Petyr.equals(Misho));

		String name = "name";
		String nameUpperCase = "NAME";
		
		System.out.println(name.equals(nameUpperCase));
		System.out.println(name.equalsIgnoreCase(nameUpperCase));
		
		String alpha = "alpha";
		String beta = "beta";
		String alphaAgain = "alpha";
		
		// alpha is before beta
		System.out.println(alpha.compareTo(beta));
		// beta is after alpha
		System.out.println(beta.compareTo(alpha));
		System.out.println(alphaAgain.compareTo(alpha));
		
	}

}
