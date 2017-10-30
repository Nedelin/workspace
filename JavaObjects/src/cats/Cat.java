package cats;

public class Cat {

	private String name;
	private int age;
	private String breed;

	public Cat(){
		
	}

	public Cat(String name, int age, String breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getbreed(){
		return breed;
	}
	public void setBreed(String breed){
		this.breed = breed;
	}
	
	public void bark(){
		System.out.println(name + " is barking");
	}
	
	public void eat(){
		System.out.println(name + " is eating");
	}
	public void run(){
		System.out.println(name+ " is running");
	}
	public void sleep(){
		System.out.println(name + " is sleeping");
	}

}
