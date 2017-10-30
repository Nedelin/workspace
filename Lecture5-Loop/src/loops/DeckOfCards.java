package loops;

public class DeckOfCards {

	public static void main(String[] args) {
		String [] suits = {"clubs" ,"diamonds", "hearts", "spades"};
		String [] cards = {"2","3","4","5","6","7","8","9","10",
				"Jack","Queen","King","Ace" };
		for(String suit : suits){
			for(String card : cards){
				System.out.println(card+" of "+suit);
			}
		}
	}

}
