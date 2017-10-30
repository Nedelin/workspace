package stack;

import java.util.Arrays;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> names = new Stack<>();
		//add
		names.push("Peter");
		names.push("Toni");
		names.push("Asparuh");
		//get and return
		printStack(names);
		System.out.println(names.pop());
		//get
		printStack(names);
		System.out.println(names.peek());
		//size
		System.out.println(names.size());
		//contains
		System.out.println(names.contains("Peter"));
		names.clear();
		printStack(names);
	}
	private static void printStack(Stack stack){
		//masiv
		System.out.println(Arrays.toString(stack.toArray()));
	}

}
