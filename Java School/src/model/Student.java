package model;

public class Student {
	
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	// konstruktor 
	public Student(){
		
	}
	public Student(long id, String name){
		this.id=id;
		this.name=name;
	}

}
