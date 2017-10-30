import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class StudentThread extends Thread{
	private Socket socket;
	private Scanner clientReader;
	private PrintStream clientWriter;
	private Queue<Document> documentsQue;

	
	public StudentThread(Socket socket, Queue<Document> documentsQue) throws IOException
		{
			this.socket = socket;
			Scanner clientReader = new Scanner(socket.getInputStream());
			PrintStream clientWriter = new PrintStream(socket.getOutputStream());
			this.documentsQue = documentsQue;
		}
	public void run()
		{
			clientWriter.println("Zdr, vie ste v nashiq server");
			clientWriter.println("Izberete");
			clientWriter.println("1uspeh");
			clientWriter.println("2specialna");
			
			
			if(clientReader.nextLine().equals("1"))
				{
				clientWriter.println("Vyvedete ime");
				String name = clientReader.nextLine();
				clientWriter.println("Vuvedete uspeh");
				double mark = clientReader.nextDouble();
				clientWriter.println("Vuvedete dohod");
				double dohod = clientReader.nextDouble();
				clientWriter.println("Vuvedete fakultet");
				String facultet = clientReader.nextLine();
				clientWriter.println("Vuvedete fakulteten nomer");
				String facultetenNum = clientReader.nextLine();
				
				Document doc = new Document(name, mark, dohod, facultet, facultetenNum, 1);
				documentsQue.offer(doc);
			}
			else if(clientReader.nextLine().equals("2"))
				{
				clientWriter.println("Vyvedete ime");
				String name = clientReader.nextLine();
				clientWriter.println("Vuvedete uspeh");
				double mark = clientReader.nextDouble();
				clientWriter.println("Vuvedete dohod");
				double dohod = clientReader.nextDouble();
				clientWriter.println("Vuvedete fakultet");
				String facultet = clientReader.nextLine();
				clientWriter.println("Vuvedete fakulteten nomer");
				String facultetenNum = clientReader.nextLine();
				
				Document doc = new Document(name, mark, dohod, facultet, facultetenNum, 2);
				documentsQue.offer(doc);
			}
			else
				{
					clientWriter.println("ne poznavash chislata");
				}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}