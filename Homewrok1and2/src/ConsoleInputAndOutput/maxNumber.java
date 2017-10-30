package ConsoleInputAndOutput;

import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = input.nextInt();
        System.out.println("Enter y:");
        int y = input.nextInt();

       int max= ((x + y) + Math.abs(x - y)) / 2;

        System.out.println("The bigger numbers is"+" "+ max);
    }
}
