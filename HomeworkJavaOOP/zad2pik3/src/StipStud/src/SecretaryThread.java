import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class SecretaryThread extends Thread{
	
	private Socket socket;
	private Scanner clientReader;
	private PrintStream clientWriter;
	private Queue<Document> documentsQue;
	ArrayList<Document> correctDocuments;
	ArrayList<Document> uncorrectDocuments;
	
	public SecretaryThread(Socket socket, Queue<Document> documentsQue,ArrayList<Document> correctDocuments, ArrayList<Document> uncorrectDocuments) throws IOException
	{
		this.socket = socket;
		Scanner clientReader = new Scanner(socket.getInputStream());
		PrintStream clientWriter = new PrintStream(socket.getOutputStream());
		this.documentsQue = documentsQue;
		this.correctDocuments = correctDocuments;
		this.uncorrectDocuments = uncorrectDocuments;
	}
	
	public void run()
	{
		while(!documentsQue.isEmpty())
		{
			Document doc = getDocument();
			checkDocuments(doc);
		}
		
	}
	
	public void checkDocuments(Document doc)
	{
		if(doc.getMark()>=5.50 && doc.getDohod()<500)
		{
			correctDocuments.add(doc);
		}else if(doc.getMark()>=5.30 && doc.getDohod()<300){
			correctDocuments.add(doc);
		}else {
			uncorrectDocuments.add(doc);
		}
	}
	
	public synchronized Document getDocument()
	{
		return documentsQue.poll();
	}
	
}