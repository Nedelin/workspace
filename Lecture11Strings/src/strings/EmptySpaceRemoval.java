package strings;

public class EmptySpaceRemoval {

	public static void main(String[] args) {
		String namegWithSpaces = "           Peter Manolov            ";
		String nameWithoutSpaces = namegWithSpaces.trim();
		
		System.out.println(nameWithoutSpaces);

	}

}
