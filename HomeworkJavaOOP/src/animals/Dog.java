package animals;

public class Dog extends Animal{

	public Dog (int age, String name, Gender gender){
		super(age,name,gender);
	}
	@Override
	public String animalSound() {
		return "Bau-Bau";
	}

	
}
