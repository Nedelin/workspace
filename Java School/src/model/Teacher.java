package model;

import java.util.HashSet;

public class Teacher {

	
	private String name;
	private HashSet<Subject> subjects = new HashSet<>();
	
	public Teacher(){
		
	}
	public Teacher(String name, HashSet subjects){
		this.name = name;
		this.subjects=subjects;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addSubject(Subject subject){
		subjects.add(subject);
		
	}
	
	public void removeSubject(Subject subject){
		subjects.remove(subject);
		
	}
}
