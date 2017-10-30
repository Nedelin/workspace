package animals;

public class Cat extends Animal {

	public Cat (int age, String name, Gender gender){
		super(age,name,gender);
	}
	@Override
	public String animalSound() {
		return "Mqu-Mqu";
	}

}
