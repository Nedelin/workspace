package cats;

public class CatManager {

	public static void main(String[] args) {
		Cat firstCat = new Cat();
		firstCat.setName("Puhcho");
		firstCat.setAge(3);
		firstCat.setBreed("Persiiska");
		
		Cat secondCat = new Cat("Dani",2,"Tigur");
		
		firstCat.eat();
		firstCat.sleep();
		
		secondCat.run();
	}

}
