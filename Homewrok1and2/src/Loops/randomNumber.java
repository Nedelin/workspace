package Loops;

import java.util.Random;
import java.util.Scanner;

public class randomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter N:");
        int N = scanner.nextInt();
        int value=0;
        Random random = new Random();
        for(int i=1; i<=N;i++){
            value = random.nextInt(i);

        }
        System.out.println(value);
    }
}
