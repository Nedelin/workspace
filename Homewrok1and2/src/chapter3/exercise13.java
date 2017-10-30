package chapter3;

import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enetr n:");
        int n = input.nextInt();
        if(n!= 2 && n%2==0 && n <100){
            System.out.println(n+" " + "is not prime");

        }
        else{
            System.out.println(n+" " + "is prime");
        }
    }
}
