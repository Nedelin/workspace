package lecture3;

import java.util.Scanner;

public class Task9 {

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
		if (x*x + y*y == z){
			System.out.println("Tochkata e na okryjnosta");
		}
		if(x*x + y*y >z){
			System.out.println("Tochkata e izvun okrujnosta");
		}
		
		if(x>5|| x<-1 && y<1 || y>5){
			System.out.println("Izvun pravougalnika e tochkata");
		}
		else{
			System.out.println("Tochkata e v pravoygalnika ");
			}
		}

	}
