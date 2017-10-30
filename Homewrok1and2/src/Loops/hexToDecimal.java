package Loops;

import java.util.Scanner;

public class hexToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter N:");
        String N = scanner.next();
        int temp = Integer.parseInt(N, 16 );
        System.out.println(temp);

    }
}
