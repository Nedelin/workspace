package inheritance;

public class Felidea {

	private boolean male;
	
	public Felidea(){
		this(true);
}
	public Felidea(boolean male){
		this.male = male;
	}
	public boolean isMale(){
		return male;
	}
	public void setMale(boolean male){
		this.male = male;
	}
}

