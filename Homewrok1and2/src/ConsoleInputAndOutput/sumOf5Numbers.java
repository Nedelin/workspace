package ConsoleInputAndOutput;

import java.util.Scanner;

public class sumOf5Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = input.nextInt();
        System.out.println("Enter b:");
        int b = input.nextInt();
        System.out.println("Enter c:");
        int c = input.nextInt();
        System.out.println("Enter d:");
        int d = input.nextInt();
        System.out.println("Enter e:");
        int e = input.nextInt();

        int sum = a+b+c+d+e;
        System.out.println(sum);


    }
}
