package textfileshomework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exc1PrintOddNumbersFromFile {

	public static void main(String[] args) {
		printFileInConsole(getFile("C:\\Users\\Nedelin\\Desktop\\numbers.txt"));
	}

	private static void printFileInConsole(File file) {
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String numbers = scanner.nextLine();
				int num = Integer.parseInt(numbers);
				if (num % 2 != 0) {
					System.out.println(numbers);
				}
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	private static File getFile(String pathToFile) {
		return new File(pathToFile);
	}

}