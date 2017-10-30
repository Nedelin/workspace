package Loops;

import java.util.Scanner;

public class matrixNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter N:");
        int N = scanner.nextInt();
        int a =0;
        for (int i = 0; i < N; i++)
        {
            for (int j = i + 1; j < i + 1 + N; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
