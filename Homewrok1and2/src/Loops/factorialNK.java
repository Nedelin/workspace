package Loops;

import java.util.Scanner;

public class factorialNK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter N:");
        int N = scanner.nextInt();
        System.out.println("Please enter K:");
        int K = scanner.nextInt();
        int factorialN = 1;
        int factorialK = 1;
        int factorialNK=1;
        int differenceNK= N-K;
        for(int i=1; i<=N; i++){
            factorialN= factorialN*i;

        }
        for(int y = 1; y<=K; y++){
            factorialK = factorialK*y;
        }

        for(int i = 1; i<=differenceNK; i++){
            factorialK = factorialK*i;
        }

        System.out.println((factorialN*factorialK)/factorialNK);
    }

}
