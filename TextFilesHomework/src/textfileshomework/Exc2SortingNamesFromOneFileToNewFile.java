package textfileshomework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Exc2SortingNamesFromOneFileToNewFile {

	public static void main(String[] args) {
		printFileInConsole(getFile("C:\\Users\\Nedelin\\Desktop\\name.txt"));

	}

	private static void printFileInConsole(File file) {
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				for (int i = 0; i <= 4; i++) {

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