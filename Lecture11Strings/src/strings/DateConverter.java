package strings;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(new Date());

		SimpleDateFormat formater = new SimpleDateFormat ("dd MM yyyy");
		String formattedDate = formater.format(now);
		
		SimpleDateFormat dateAndTimeFormater = new SimpleDateFormat("yyyy-MM-dd HH:mmm:ss.SSS");
		String formattedDateAndTime = dateAndTimeFormater.format(now);
		System.out.println(formattedDate);
		System.out.println(formattedDateAndTime);
	}

}
