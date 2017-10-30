package readingfromfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadingFromFile {

	public static void main(String[] args) {
		checkIfTheEmailIsValid(getFile("C:\\Users\\Nedelin\\Desktop\\mails.txt"));
	}

	private static void checkIfTheEmailIsValid(File file) {
		try {
			StringBuilder sb = new StringBuilder();
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				boolean isValid = true;
				String str = scanner.nextLine();
				String[] splited = str.split("\\s+");
				String regex = "^[A-Za-z_]+$";
				String regex2 = "^[a-z]+$";
				String regex3 = "^[a-z]{2,4}+$";
				String name = splited[0] + splited[1];
				int index = str.indexOf("v ");
				int index2 = str.indexOf("@");
				int index3 = str.indexOf(".");
				String username = str.substring(index + 2, index2);
				String host = str.substring(index2 + 1, index3);
				String domain = str.substring(index3 + 1, str.length());
				if (name.matches(regex)) {
				} else {
					isValid = false;
				}
				if (username.matches(regex)) {
				} else {
					isValid = false;
				}
				if (host.matches(regex2)) {
				} else {
					isValid = false;
				}
				if (domain.matches(regex3)) {
				} else {
					isValid = false;
				}
				if (isValid == true) {
					
					sb.append(str);
					sb.append("\n");
				}
			}
			PrintWriter out = new PrintWriter("filename.txt");
			out.write(sb.toString());
			out.close();
			System.out.println(sb);
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	private static File getFile(String pathToFile) {
		return new File(pathToFile);
	}
}