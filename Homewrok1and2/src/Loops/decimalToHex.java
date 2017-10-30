package Loops;

import java.util.Scanner;

public class decimalToHex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter N:");
        int N = scanner.nextInt();

        byte dec = (byte) (N / 16 * 10 + N % 16);
        System.out.println(dec);
    }
}
