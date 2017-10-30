package Student;

public class Student {

	private String names;
	private int course;
	private Specialty specialty;
	private University university;
	private String email;
	private String mobileNumber;
	private static int counter = 0;
	
	public static int getCounter() {
		return counter;
	}
	
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int i) {
		this.course = i;
	}
	public Specialty getSpecialty() {
		return specialty;
	}
	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Student(){
		counter++;
	}
	public Student (String names){
		counter++;
		this.names = names;
	}
	public Student (String names, University university, Specialty specialty){
		this(names);
		this.university = university;
		this.specialty = specialty;
	}
	public Student(String names, University university, Specialty specialty, String email, short course, String mobileNumber){
		this(null, university, specialty);
		this.email = email;
		this.course = course;
		this.mobileNumber = mobileNumber;
	}
	public void printInformation(){
		System.out.println(names);
		System.out.println(university);
		System.out.println(specialty);
		System.out.println(email);
		System.out.println(course);
		System.out.println(mobileNumber);
	}
}
