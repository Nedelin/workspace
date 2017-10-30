package writingtextfile;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintNumbersToFile {

	public static void main(String[] args) {

		int numbers = 20;
		printNumbersToFile(numbers);
	}
	private static void printNumbersToFile (int numbers){
		
		try{
			PrintStream stream = new PrintStream("number.txt");
			for (int i = 1; i <= numbers; i++) {
				stream.println(i);
			}
			stream.close();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}

}
