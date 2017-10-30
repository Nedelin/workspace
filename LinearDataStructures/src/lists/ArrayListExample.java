package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Petur");
		names.add("Kiril");
		names.add("Toni");
		
		
		printArrayList(names);
		List<String> names2 = new ArrayList<>();
		names.remove(0);
		printArrayList(names);
		names.add(1, "Stoqn");
		printArrayList(names);
		System.out.println(names.contains("Petur"));
		System.out.println(names.contains("Toni"));
		System.out.println(names.size());
		names.clear();
		System.out.println(names);
		System.out.println(names.isEmpty());
		names.add("Toshko");
		System.out.println(names.isEmpty());
		System.out.println(names.get(0));
		
		
		List<String> foreignNames = new ArrayList<>();
		foreignNames.add("Jhony");
		foreignNames.add("Tom");
		names.addAll(foreignNames);
		System.out.println(names);
		
		Collections.sort(names);
		System.out.println(names);
	}
	private static void printArrayList(ArrayList<String> list){
		System.out.println(Arrays.toString(list.toArray()));
	}

}
