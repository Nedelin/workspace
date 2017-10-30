package objects;

public class Dog {

	// harektiristiki na nashiq obekt.
	private String name;
	private int age;
	private String breed;
	//konstruktor
	public Dog (){
		
	}
	
	public Dog(String name, int age, String breed){
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
