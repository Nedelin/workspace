package methods;

import java.util.Scanner;

public class Exc3LastNumberName {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = scanner.nextInt();
        numberName(n);
    }

    static void numberName(int n) {
        int lastDigit = Math.abs(n) % 10;
        String digit;
        switch (lastDigit) {
            case 0:
                digit = "zero";
                System.out.println(digit);
                break;
            case 1:
                digit = "one";
                System.out.println(digit);
                break;
            case 2:
                digit = "two";
                System.out.println(digit);
                break;
            case 3:
                digit = "three";
                System.out.println(digit);
                break;
            case 4:
                digit = "four";
                System.out.println(digit);
                break;
            case 5:
                digit = "five";
                System.out.println(digit);
                break;
            case 6:
                digit = "six";
                System.out.println(digit);
                break;
            case 7:
                digit = "seven";
                System.out.println(digit);
                break;
            case 8:
                digit = "eight";
                System.out.println(digit);
                break;
            case 9:
                digit = "nine";
                System.out.println(digit);
                break;
            default:
                digit = "Invalid digit";
                System.out.println(digit);
                break;
        }

    }
}