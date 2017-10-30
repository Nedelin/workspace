package zad2pik3;

public class Citizen {
	
	protected String name;
	protected String EGN;
	protected String adress;
	
	public Citizen(String name, String EGN, String adress) {
		this.name = name;
		this.EGN = EGN;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEGN() {
		return EGN;
	}

	public void setEGN(String eGN) {
		EGN = eGN;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
	
}
