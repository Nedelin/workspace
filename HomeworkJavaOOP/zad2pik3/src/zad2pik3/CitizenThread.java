package zad2pik3;

import java.util.LinkedList;
import java.util.Scanner;

public class CitizenThread extends Thread{
	
	private String[] candidates;
	private Scanner scanner = new Scanner(System.in);
	private String useEGN;
	
	
	public CitizenThread(String useEGN) {
		candidates = new String[] {"Gosho","Misho","Bobi", "Rozalia"};
		this.useEGN = useEGN;
	}
	
	
	public void run() {
		System.out.println(candidates);
		System.out.println("Enter name,adress,choise");
		String name = scanner.nextLine();
		String adress = scanner.nextLine();
		int choise = scanner.nextInt();
		
		Citizen currentCitizen = new Citizen(name, this.useEGN, adress);
		Server.votedCitizenRegistered.add(currentCitizen);
		
		Integer numberVote = Server.votes.get(choise)+1;
		
		Server.votes.put(choise, numberVote);
		
	}
}
