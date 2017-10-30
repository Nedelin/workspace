package customarraylist;

public class CustomArrayList {

	private Object[] elements = new Object[10];

	public Object[] getElements() {
		return elements;
	}

	public void add(Object element) {
		if (element == null) {
			return;
		}
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == null) {
				elements[i] = element;
				return;
			}
		}
	}

	public void remove(Object element) {
		if (element == null) {
			return;
		}
		int indexOfFoundElement = -1;
		for (int i = 0; i < elements.length; i++) {
			if (element.equals(elements[i])) {
				indexOfFoundElement = i;
				break;
			}
		}
		for (int i = indexOfFoundElement; i < elements.length - 1; i++) {
			elements[i] = elements[i + 1];
		}
	}
	public int size(){
		int counter = 0;
		for (int i = 0; i < elements.length; i++) {
			if(elements[i]!=null){
				counter ++;
			}else{
				break;
			}
		}
		return counter;
	}
	public boolean containts(Object element){
		if(element == null){
			return false;
		}
		for (int i = 0; i < elements.length; i++) {
			if(elements[i]==null){
				return false;
			}
			if(element.equals(elements[i])){
				return true;
			}
		}
		return false;
	}
}
