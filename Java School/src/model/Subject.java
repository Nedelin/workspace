package model;

public class Subject {

	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfLessons() {
		return numberOfLessons;
	}

	public void setNumberOfLessons(int numberOfLessons) {
		this.numberOfLessons = numberOfLessons;
	}

	public int getNumberOfExercises() {
		return numberOfExercises;
	}

	public void setNumberOfExercises(int numberOfExercises) {
		this.numberOfExercises = numberOfExercises;
	}

	private int numberOfLessons;
	private int numberOfExercises;
	
	public Subject(){
		
	}
	
	public Subject(String name, int numberOfLessons, int numberOfExercises){
		this.name = name;
		this.numberOfLessons = numberOfLessons;
		this.numberOfExercises = numberOfExercises;
	}
}
