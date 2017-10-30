package Loops;

import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter N:");
        int N = scanner.nextInt();
        System.out.println(Integer.toBinaryString(N));
    }

}
