package zad2pik3;

import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HelperThread extends Thread {
	
		
		private Socket socket;
		private Scanner scaner;
		private Map<String, String> map;
		
		public HelperThread(Socket socket) {
			this.socket = socket;
			scaner = new Scanner(System.in);
			map  = new HashMap<>();
			map.put("password", "admin");
			map.put("1234854747", "user");
			map.put("1234851245", "user");
		}
		
		public void run() {
			System.out.println("Enter egn or pw!");
			String userInput = scaner.nextLine();
			
			if(map.containsKey(userInput)) {
				String value = map.get(userInput);
				if(value.equals("user")) {
					CitizenThread ob = new CitizenThread(userInput);
					ob.start();
				}
				
				
			}else {
				System.out.println("REfused");
			}
			
			
			
		}
		

}
