package linkedlist;

import java.util.Arrays;

public class TestNodeLinkedList {

	public static void main(String[] args) {
		NodeLinkedList customList = new NodeLinkedList();
		Node first = new Node();
		first.setName("Peter");
		Node second = new Node();
		second.setName("Toni");
		second.setPrevious(first);
		first.setNext(second);
		Node third = new Node();
		third.setName("Kiril");
		second.setNext(third);
		third.setPrevious(second);
		
		customList.setLast(third);
		
		// test contains
		
		System.out.println(customList.contain(third));
		
		// size
		System.out.println(customList.size());
		
		//toArray
		System.out.println(Arrays.toString(customList.toArray()));
	}

}
