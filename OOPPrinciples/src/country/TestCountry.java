package country;

public class TestCountry {

	public static void main(String[] args) {
		Capital capital = new Capital();
		capital.setName("Sofia");
		capital.setPopulation(1260000);
		Country country = new Country();
		country.setCapital(capital);
		country.setName("Bulgaria");

	}

}
