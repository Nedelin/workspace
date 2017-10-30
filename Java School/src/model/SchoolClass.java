package model;

import java.util.HashSet;

public class SchoolClass {
	
	private String uniqueId;
	private HashSet<Teacher> teachers = new HashSet<>();
	
	public SchoolClass(){
		
	}
	
	public SchoolClass(String uniqueId, HashSet<Teacher> teachers){
		this.uniqueId = uniqueId;
		this.teachers = teachers;
	}
	
	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	
	public void addTeacher(Teacher teacher){
		teachers.add(teacher);
	}
	
	public void removeTeacher(Teacher teacher){
		teachers.remove(teacher);
	}
}
