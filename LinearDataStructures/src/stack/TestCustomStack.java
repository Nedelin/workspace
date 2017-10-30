package stack;

import java.util.Arrays;

public class TestCustomStack {

	public static void main(String[] args) {
		CustomStack customList = new CustomStack();
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
		Node fourth = new Node();
		fourth.setName("Ivan");
		fourth.setPrevious(third);
		customList.push(fourth);
		System.out.println(customList.pop());
		System.out.println(customList.peek());
		System.out.println(customList.size());
		System.out.println(customList.contain(fourth));
		System.out.println(Arrays.toString(customList.toArray()));
		customList.clear();
		System.out.println(Arrays.toString(customList.toArray()));
	}

}
