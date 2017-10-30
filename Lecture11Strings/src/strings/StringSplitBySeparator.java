package strings;

public class StringSplitBySeparator {

	public static void main(String[] args) {
		String beers = "Zagorka, Kamenica, Ariana, Becks, Tuborg";
		String[] beersArray = beers.split("[ ,.]+");
		
		for (String beer : beersArray) {
			System.out.println(beer);
		}
	}

}
