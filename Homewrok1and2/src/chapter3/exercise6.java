package chapter3;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enetr number for a:");
        int a = input.nextInt();
        System.out.println("Enetr number for b:");
        int b = input.nextInt();
        System.out.println("Enetr number for h:");
        int h = input.nextInt();
        int S =  ((a + b) / 2) * h;

        System.out.println("S="+" "+ S);
    }
}
