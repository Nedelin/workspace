package ConsoleInputAndOutput;

import java.util.Scanner;

public class circleRadius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        int r = input.nextInt();
        double pi = Math.PI;
        double P = 2*pi*r;
        double S = pi*r*r;

        System.out.println("The perimeter of the circle is"+" "+P);
        System.out.println("The area of the circle is"+" "+S);
    }
}
