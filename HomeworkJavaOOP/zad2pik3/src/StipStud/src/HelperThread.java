import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class HelperThread extends Thread{
	private Socket socket;
	private Scanner clientReader;
	private PrintStream clientWriter;
	private Scanner fileSecretaryReader;
	private Scanner fileStudentReader;
	private Queue<Document> documentsQue;
	ArrayList<Document> correctDocuments;
	ArrayList<Document> uncorrectDocuments;
	
	public HelperThread(Socket socket, Queue<Document> documentsQue, ArrayList<Document> correctDocuments, ArrayList<Document> uncorrectDocuments) throws IOException
	{
		this.socket = socket;
		Scanner clientReader = new Scanner(socket.getInputStream());
		PrintStream clientWriter = new PrintStream(socket.getOutputStream());
		fileSecretaryReader = new Scanner(new File("D\\secretary.txt"));
		fileStudentReader = new Scanner(new File("D\\student.txt"));
		this.documentsQue = documentsQue;
		this.correctDocuments = correctDocuments;
		this.uncorrectDocuments = uncorrectDocuments;
	}	
	public void run()
	{
		clientWriter.println("Kakvo ste");
		clientWriter.println("1 sekretar");
		clientWriter.println("2 student");		
		if(clientReader.nextLine().equals("1"))
			{
				clientWriter.println("Vyvedi sl nomer");
				String secretariNumber = clientReader.nextLine();
				while(fileSecretaryReader.hasNextLine()) 
				{
					if(fileSecretaryReader.nextLine().equals(secretariNumber))
					{
						try {
							new SecretaryThread(socket, documentsQue, correctDocuments, uncorrectDocuments).start();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				clientWriter.println("Nqma takava secretarka");
			}
		else if(clientReader.nextLine().equals("2"))
			{
				clientWriter.println("Vyvedi fak num");
				String studentNumber = clientReader.nextLine();
				while(fileStudentReader.hasNextLine()){
					if(fileSecretaryReader.nextLine().equals(studentNumber))
					{
						try {
							new StudentThread(socket, documentsQue).start();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				clientWriter.println("Nqma student");
			}
		else
			{
				clientWriter.println("Ti nesi nishto!");
			}
	}
}