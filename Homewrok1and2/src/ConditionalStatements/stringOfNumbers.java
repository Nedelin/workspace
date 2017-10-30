package ConditionalStatements;

import java.util.Scanner;

public class stringOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n:");
        int digit = input.nextInt();
        switch (digit) {
            case 0:
                System.out.println("нула");
                break;
            case 1:
                System.out.println("едно");
                break;
            case 2:
                System.out.println("две");
                break;
            case 3:
                System.out.println("три");
                break;
            case 4:
                System.out.println("четири");
                break;
            case 5:
                System.out.println("пет");
                break;
            case 6:
                System.out.println("шест");
                break;
            case 7:
                System.out.println("седем");
                break;
            case 8:
                System.out.println("осем");
                break;
            case 9:
                System.out.println("девет");
                break;
            default:
                System.out.println("Не познавам тази цифра!");
        }
    }

}
