package objects;

public class StaticTest {
	private static String name;
	public static String getName(){
		return name;
	}
	public static void setName(String newName){
		name = newName;
	}
	public static void printName(){
		System.out.println(name);
	}

}
