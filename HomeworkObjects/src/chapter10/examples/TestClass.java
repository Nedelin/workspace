package chapter10.examples;

import chapter10.Cat;
import chapter10.Sequence;

public class TestClass {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		Cat cat = new Cat();
		Sequence sequence = new Sequence();
		for(int i = 0;i<=arr.length;i++){
			cat.sayMiau();
		}
	}
	

}
