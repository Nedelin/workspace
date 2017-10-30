package customarraylist;

import java.util.Arrays;

public class CustomArrayListTest {

	public static void main(String[] args) {
		CustomArrayList list = new CustomArrayList();
		list.add("Kiril");
		printElements(list);
		list.add("Toshko");
		printElements(list);
		list.remove("Toshko");
		printElements(list);
		list.add("Pencho");
		System.out.println(list.size());
		System.out.println(list.containts("Kiril"));
		System.out.println(list.containts("Toshko"));
		System.out.println(list.containts("Pencho"));
		
	}
	private static void printElements(CustomArrayList list){
		System.out.println(Arrays.toString(list.getElements()));
	}

}
