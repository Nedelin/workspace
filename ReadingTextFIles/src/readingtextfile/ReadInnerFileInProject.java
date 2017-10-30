package readingtextfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadInnerFileInProject {
	public static void main(String[] args) {
		printFileInConsole(getFile("src/readingtextfile/innertext.txt"));
		

	}
	private  static void printFileInConsole(File file){
		try{
			Scanner scanner = new Scanner (file);
			while(scanner.hasNextLine()){
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}
	private static File getFile(String pathToFile){
		return new File(pathToFile);
	}

}
