package Loops;

import java.util.Scanner;

public class zerosInFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter N:");
        long N = scanner.nextLong();
        long factorialN = 1;
        long count =0;
            for(long i =1; i<=N; i++){
                factorialN=factorialN*i;
            }
            for(long y =factorialN;y%5==0;y/=5){
                count = count +1;

            }
        System.out.println(count);

    }
}
