package chapter3;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enetr your weight:");
        double a = input.nextInt();
        double c = 0.17;
        double weightOnMoon= a*c;
        System.out.println(weightOnMoon);
    }
}
