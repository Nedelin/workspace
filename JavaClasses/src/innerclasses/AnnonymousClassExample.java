package innerclasses;

public class AnnonymousClassExample {

	public static void main(String[] args) {
		new Object (){
			void printResult(){
				System.out.println(5);
			}
		}.printResult();

	}

}
