package model;

import java.util.HashSet;

public class School {
	private String name;
	private HashSet<Student> students= new HashSet<>(); 
	private HashSet<SchoolClass> classes = new HashSet<>();
	
	public School(){
		
	}
	
	public School(String name, HashSet<Student> students, HashSet<SchoolClass> classes){
		this.name = name;
		this.students = students;
		this.classes = classes;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addStudent(Student student){
		students.add(student);
	}
	public void removeStudent(Student student){
		students.remove(student);
	}
	
	public void addSchoolClass(SchoolClass schoolClass){
		classes.add(schoolClass);
		
	}
	
	public void removeSchoolClass(SchoolClass schoolClass){
		classes.remove(schoolClass);
		
	}
	
	
	
	
	
	
	
	
	

}
