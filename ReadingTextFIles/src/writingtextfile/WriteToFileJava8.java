package writingtextfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteToFileJava8 {

	public static void main(String[] args) {
		String text = "samo randomn text";
		try{
			Files.write(Paths.get("java8.txt"),text.getBytes());
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
