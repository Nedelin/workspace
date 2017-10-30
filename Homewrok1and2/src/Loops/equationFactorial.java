package Loops;

import java.util.Scanner;

public class equationFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter n:");
        int n = scanner.nextInt();
        long factorial = 1;
        double res = 0;
        for (int x = 1; x <= n; x++) {
            factorial *= x;
            double stepen = Math.exp(x);
            res += factorial / stepen;
        }
        double S = 1 + res;
        System.out.println(S);
    }
}
