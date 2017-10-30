package strings;

import java.util.Date;

public class StringBuilderConcatenation {

	public static void main(String[] args) {
		System.out.println(new Date());
		
		StringBuilder collector = new StringBuilder("Number: ");
		
		for (int i = 1; i < 100000; i++) {
			collector.append(i);
		}
		System.out.println(collector.toString().substring(0, 1024));
		System.out.println( new Date());
	}

}
