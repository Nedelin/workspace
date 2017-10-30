package innerclasses;

import org.omg.Messaging.SyncScopeHelper;

public class LocalClassExample {

	public static void main(String[] args) {
		int a = 5;
		class LocalClass{
			void printResult(){
				System.out.println(a);
			}
		}
		LocalClass localClass = new LocalClass();
		localClass.printResult();
	}

}
