package lecture3;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Kordinatata X e ravna na:");
		int x = input.nextInt();
		System.out.println("Kordinatata Y e ravna na:");
		int y = input.nextInt();
		int z = 25;
		if (x*x + y*y <z){
			System.out.println("Tochkata e vutre v okryjnosta");
		}
		else if (x*x + y*y == z){
			System.out.println("Tochkata e na okryjnosta");
		}
		else{
			System.out.println("Tochkata e izvun okrujnosta");
		}
	}

}
