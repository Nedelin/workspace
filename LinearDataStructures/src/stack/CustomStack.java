package stack;


public class CustomStack {

	private Node last;

	public void push(Node node) {
		if(last == null){
			last = node;
			return;
		}
		last.setNext(node);
		node.setPrevious(last);
		last=node;

		
	}

	public Node pop() {
		Node nodeToBeRemoved = last;
		last = last.getPrevious();
		if(last !=null){
			last.setNext(null);
		}
		return nodeToBeRemoved;
	}
	public Node peek(){
		if(last !=null){
			last.setNext(null);
		}
		return last;
	}
	
	public int size() {
		int size = 0;
		if (last == null) {
			return 0;
		}
		size++;
		Node node = last.getPrevious();
		while (node != null) {
			size++;
			node = node.getPrevious();
		}
		return size;
	}
	public void clear(){
		last = null;
	}

	public boolean contain(Node givenNode) {
		if (last == null) {
			return false;
		}
		Node node = last;
		if (last.getName().equals(givenNode.getName())) {
			return true;
		}
		while (node != null) {
			if (node.getName().equals(givenNode.getName())) {
				return true;
			}
			node = node.getPrevious();
		}
		return false;

	}

	public Node[] toArray() {
		if (last == null) {
			return new Node[0];
		}
		Node[] array = new Node[size()];
		int counter = 1;
		array[size() - counter] = last;
		Node node = last.getPrevious();
		while (node != null) {
			array[size() - ++counter] = node;
			node = node.getPrevious();
			
		}
		return array;

	}
}
