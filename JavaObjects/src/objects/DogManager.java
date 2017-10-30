package objects;

public class DogManager {

	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println(dog.getName());
		dog.setName("Roko");
		System.out.println(dog.getName());

		Dog secondDog = new Dog("Dani",3,"Golden Retriever");
		
		secondDog.bark();
		
		secondDog.eat();
		secondDog.run();
		secondDog.sleep();
	}

}
