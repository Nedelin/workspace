package chapter3;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enetr number for a:");
        int a = input.nextInt();
        System.out.println("Enetr number for b:");
        int b = input.nextInt();

        int P = 2*(a+b);
        int S = a*b;

        System.out.println("P="+" "+ P);
        System.out.println("S="+" "+ S);

    }
}
