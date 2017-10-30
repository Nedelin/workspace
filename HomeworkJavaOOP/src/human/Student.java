package human;

public class Student extends Human implements Comparable<Student> {

	private int ocenka;

	public int getOcenka() {
		return ocenka;
	}

	public void setOcenka(int ocenka) {
		this.ocenka = ocenka;
	}

	public Student(int ocenka, String firstName, String lastName) {
		super(firstName, lastName);
		this.ocenka = ocenka;
	}

	@Override
	public int compareTo(Student o) {
		if (getOcenka() == o.getOcenka()) {
			return 0;
		}
		if (getOcenka() < o.getOcenka()) {
			return -1;
		}
		return 1;
	}

	@Override
	public String toString() {
		return "Student [ocenka=" + ocenka + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
