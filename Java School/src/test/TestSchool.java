package test;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;

import model.School;
import model.SchoolClass;
import model.Student;
import model.Subject;
import model.Teacher;

public class TestSchool {

	@Test
	public void testScool() {
		School school = createSchool();
		assertEquals("Vasil Levski", school.getName());
		
		
	}

	private static School createSchool() {
		Student firstStudent = new Student(1, "Petyr Ivanov");
		Student secondStudent = new Student(2, "Kiril Petkov");
		Student thirdStudent = new Student(3, "Mariq Ilieva");

		Subject maths = new Subject("Maths", 20, 20);
		Subject programming = new Subject("Programming", 30, 30);
		Subject english = new Subject("English", 25, 25);

		Teacher firstTeacher = new Teacher();
		firstTeacher.setName("Toshko Todorov");
		firstTeacher.addSubject(maths);
		firstTeacher.addSubject(programming);

		HashSet<Subject> subjectsOfSecondTeacher = new HashSet<>();
		subjectsOfSecondTeacher.add(english);
		Teacher secondTeacher = new Teacher("Pavel Petkov", subjectsOfSecondTeacher);

		SchoolClass b5Class = new SchoolClass();
		b5Class.setUniqueId("5 ти Б клас");
		b5Class.addTeacher(firstTeacher);
		b5Class.addTeacher(secondTeacher);

		School school = new School();

		school.setName("Vasil Levski");
		school.addStudent(firstStudent);
		school.addStudent(secondStudent);
		school.addStudent(thirdStudent);
		school.addSchoolClass(b5Class);

		return school;
	}

}

