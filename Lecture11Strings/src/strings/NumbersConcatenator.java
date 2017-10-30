package strings;

import java.util.Date;

public class NumbersConcatenator {

	public static void main(String[] args) {
		System.out.println(new Date());
		
		
		String collector = "Numbers: ";
		
		for (int i = 1; i < 100000; i++) {
			collector+=i;
		}
		System.out.println(collector.substring(0,1024));
		System.out.println( new Date());
	}

}
