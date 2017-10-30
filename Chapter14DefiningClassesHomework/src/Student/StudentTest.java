package Student;

import java.util.Set;

public class StudentTest {

	public static void main(String[] args) {
		Student firstStudent = new Student("Petur", University.SU, Specialty.Law);
		Student secondStudent = new Student("Ivan");
		Student thirdStudent = new Student();
		
		thirdStudent.setCourse(3);
		thirdStudent.setNames("Georgi");
		thirdStudent.setEmail("georgi@abv.bg");
		thirdStudent.setUniversity(University.NSA);
		thirdStudent.setSpecialty(Specialty.Football);
		System.out.println("The created objects are : "+ Student.getCounter());
		thirdStudent.printInformation();
	}


}
