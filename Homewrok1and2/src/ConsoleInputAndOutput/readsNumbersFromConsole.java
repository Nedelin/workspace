package ConsoleInputAndOutput;

import java.util.Scanner;

public class readsNumbersFromConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = input.nextInt();
        System.out.println("Enter b:");
        int b = input.nextInt();
        System.out.println("Enter c:");
        int c = input.nextInt();
        int sum = a + b + c;
        System.out.println("The sum of the numbers is"+" "+sum);
    }
}
