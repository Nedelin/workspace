package innerclasses;

public class OutherClass {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

	private class InnerClass {
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
	public static void main(String[] args){
		OutherClass outherClass = new OutherClass();
		outherClass.setName("This is outer class");
		InnerClass innerClass = outherClass.new InnerClass();
		innerClass.setName("This is inner class");
		
		System.out.println(outherClass.getName());
		System.out.println(innerClass.getName());
	}
}
