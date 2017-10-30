package arrays;

public class WorkingDaysOfWeek {

	public static void main(String[] args) {
		String [] daysOfWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

		for (String day : daysOfWeek) {
			if(!(day.equals("Sunday") || day.equals("Saturday"))){
				System.out.println(day);
			}
		}
		System.out.println();
		for (String day : daysOfWeek) {
			if(!day.startsWith("S")){
				System.out.println(day);
			}
		}
		for (String day : daysOfWeek) {
			if(!(day.toCharArray()[1] == 'u')){
				System.out.println(day);
			}
		}
	}

}
