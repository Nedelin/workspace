package chapter2;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Type triangle lenght:");

        int n = input.nextInt();
        int last;
        int max;
        int spaces = n - 1;
        int min = 1;

        for (int i = 0; i < n; i++) {
            last = 2 * i + 1;
            max = spaces + last;

            for (int j = min; j <= max; j++) {
                if (j == spaces + 1 || j == max || i == n - 1)
                    System.out.print('*');
                else
                    System.out.print(' ');
            }

            System.out.println();
            spaces--;
        }
    }
}





