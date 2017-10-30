package animals;

public class Kitten extends Animal {

	public Kitten (int age, String name, Gender gender){
		super(age,name,gender);
	}
	@Override
	public String animalSound() {
		return "mrrr";
	}

}
