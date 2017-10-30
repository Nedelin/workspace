package queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import javax.sql.rowset.CachedRowSet;
import javax.swing.plaf.synth.SynthStyle;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> cashDesk = new LinkedList<>();
		//add
		cashDesk.offer("Peter");
		cashDesk.offer("Toni");
		cashDesk.offer("Misho");
		printQueue(cashDesk);
		// remove first
		cashDesk.poll();
		printQueue(cashDesk);
		System.out.println(cashDesk.peek());
		printQueue(cashDesk);
		System.out.println(cashDesk.contains("Peter"));
		System.out.println(cashDesk.contains("Toni"));
		cashDesk.clear();
		
		printQueue(cashDesk);
		

	}
	private static void printQueue(Queue <String> queue){
		System.out.println(Arrays.toString(queue.toArray()));
	}

}
