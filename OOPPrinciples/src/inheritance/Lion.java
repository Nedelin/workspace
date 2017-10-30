package inheritance;

public class Lion extends Felidea {

	private int weight;
	
	public Lion(boolean male, int weight){
		super(male);
		this.weight =weight;
		
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
