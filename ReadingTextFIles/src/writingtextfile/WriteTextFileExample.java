package writingtextfile;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class WriteTextFileExample {
	public static void main(String[] args) {
		String input = getInputToWriteToFile();
		printTextToFile(input, "writetofile.txt");
	}

	private static String getInputToWriteToFile() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		return input;
	}

	private static void printTextToFile(String text, String path) {
		try {
			PrintStream stream = new PrintStream(path);
			stream.print(text);
			stream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
