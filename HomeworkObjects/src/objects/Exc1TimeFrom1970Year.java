package objects;

public class Exc1TimeFrom1970Year {

	public static void main(String[] args) {
		long time = (long) System.currentTimeMillis();
		long timesec = time/1000;
		long timeminutes = timesec/60;
		long timehours = timeminutes/60;
		long timedays = timehours/24;
		System.out.println("From 1970 to today there are " +timedays + " days "+timehours + " hours " +timeminutes +" minutes");
	}

}
