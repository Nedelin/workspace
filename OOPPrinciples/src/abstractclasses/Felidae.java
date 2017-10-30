package abstractclasses;

public abstract class Felidae {
	private boolean male;

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}
	
	public abstract boolean catchPray(Object pray);

}
