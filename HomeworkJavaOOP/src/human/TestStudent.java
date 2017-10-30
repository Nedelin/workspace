package human;

import java.util.Arrays;

public class TestStudent {

	public static void main(String[] args) {
		Student student1 = new Student(4,"Asen","Ivanov");
		Student student2 = new Student(2,"ivan","Ivanov");
		Student student3 = new Student(3,"georgi","Ivanov");
		Student student4 = new Student(5,"kosio","Ivanov");
		Student student5 = new Student(6,"parvan","Ivanov");
		Student student6 = new Student(4,"atanas","Ivanov");
		Student student7 = new Student(3,"petur","Ivanov");
		Student student8 = new Student(2,"stefan","Ivanov");
		Student student9 = new Student(3,"viktor","Ivanov");
		Student student10 = new Student(6,"dimirat","Ivanov");
		
		Student[] students = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};
		Arrays.sort(students);
		
		System.out.println(Arrays.toString(students));
		
	
		Worker worker1 = new Worker(1200, 50,"Asen","Ivanov");
		Worker worker2 = new Worker(1300, 30,"ivan","Ivanov");
		Worker worker3 = new Worker(1400, 40,"georgi","Ivanov");
		Worker worker4 = new Worker(1200, 50,"mitko","Ivanov");
		Worker worker5 = new Worker(1500, 60,"viktor","Ivanov");
		Worker worker6 = new Worker(1600, 70,"kosio","Ivanov");
		Worker worker7 = new Worker(1700, 80,"toni","Ivanov");
		Worker worker8= new Worker(2000, 90,"kiril","Ivanov");
		Worker worker9 = new Worker(1000, 110,"ioana","Ivanov");
		Worker worker10 = new Worker(900, 10,"ioan","Ivanov");
		
		Worker[] workers = {worker1, worker2, worker3, worker4, worker5, worker6, worker7, worker8, worker9, worker10};
		Arrays.sort(workers);
		System.out.println(Arrays.toString(workers));
	}

}
