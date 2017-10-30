package readingtextfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFileJava8 {

	public static void main(String[] args) throws IOException {
		String content = new String (Files.readAllBytes(Paths.get("test.txt")));
		System.out.println(content);

	}

}
