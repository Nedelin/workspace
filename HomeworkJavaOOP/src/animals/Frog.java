package animals;

public class Frog extends Animal {

	public Frog (int age, String name, Gender gender){
		super(age,name,gender);
	}
	@Override
	public String animalSound() {
		return "Kvak-Kvak";
	}

}
