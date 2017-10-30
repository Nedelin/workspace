import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Server {
	
	
	
	public static void main(String[] args) throws IOException {
			Queue<Document> documentsQue = new LinkedList<Document>();
			ArrayList<Document> correctDocuments = new ArrayList<Document>();
			ArrayList<Document> uncorrectDocuments = new ArrayList<Document>();
			
			ServerSocket server = new ServerSocket(8888);
			Socket socket = null;
		while(true)
			{
				socket = server.accept();
				HelperThread ob = new HelperThread(socket, documentsQue, correctDocuments, uncorrectDocuments);
				ob.start();
			}
		
	}
}