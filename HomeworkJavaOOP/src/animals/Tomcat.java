package animals;

public class Tomcat extends Animal {

	public Tomcat (int age, String name, Gender gender){
		super(age,name,gender);
	}
	@Override
	public String animalSound() {
		return "MMRRRRRRRRR";
	}

}
