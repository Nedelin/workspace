package zad2pik3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Server {

	
	public static LinkedList<String> votedCitizenRegistered = new LinkedList<String>();
	public static Map<Integer, Integer> votes = new HashMap<>();
	
	public void main(String[] args) throws IOException {
		votes.put(0, 0);
		votes.put(1, 0);
		votes.put(2, 0);
		votes.put(3, 0);
		
		
		
		ServerSocket server = new ServerSocket(1211);
		Socket socket = null;
		
		while(true) {
			socket = server.accept();
			HelperThread ob = new HelperThread(socket);
			ob.start();
		}
		
	}
}
