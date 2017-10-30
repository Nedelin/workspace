package linkedlist;

public class NodeLinkedList {

	private Node last;

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	public void add(Node node) {
		last.setNext(node);
	}

	public void removeLastElement() {
		last = last.getPrevious();
	}

	public boolean remove(Node givenNode) {
		if (last == null) {
			return false;
		}
		Node node = last;
		while (node != null) {
			if (givenNode.getName().equals(node)) {
				if (node.getPrevious() != null) {
					node.getPrevious().setNext(node.getNext());
				}
				if (node.getNext() != null) {
					node.getNext().setPrevious(node.getPrevious());
				}
				if (node.getPrevious() == null && node.getNext() == null) {
					last = null;
				}
				return true;
			}
			node = node.getPrevious();
		}
		return false;
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
	
	
	public boolean add(int givenIndex,Node givenNode){
		if(givenIndex>size()|| givenIndex<0 || givenNode ==null){
			return false;
		}
		Node node = last;
		int index = size()-givenIndex;
		for (int i = 0; i < index; i++) {
			node= node.getPrevious();
		}
		givenNode.setPrevious(node.getPrevious());
		givenNode.setNext(node);
		node.getPrevious().setNext(givenNode);
		node.setPrevious(givenNode);
		return true;
	}
	public Node get(int givenIndex){
		if(givenIndex>size() || givenIndex<0){
			return null;
		}
		if (givenIndex == size() - 1){
			return last;
		}
		Node node = last;
		int index = size()-givenIndex;
		for (int i = 0; i < index; i++) {
			node= node.getPrevious();
		}
		return node;
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
