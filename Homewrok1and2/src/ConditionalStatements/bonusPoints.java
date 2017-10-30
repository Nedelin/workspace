package ConditionalStatements;

import java.util.Scanner;

public class bonusPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = input.nextInt();
        int finalPoints = 0;
        switch (n) {
            case 1:
            case 2:
            case 3:
                finalPoints = n * 10;
                break;

            case 4:
            case 5:
            case 6:
                finalPoints = n * 100;
                break;
            case 7:
            case 8:
            case 9:
                finalPoints = n * 1000;
                break;
        }
        System.out.printf("Bonus points: "+ finalPoints);
    }
}
