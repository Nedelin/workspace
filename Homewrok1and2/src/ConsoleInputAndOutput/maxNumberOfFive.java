package ConsoleInputAndOutput;

import java.util.Scanner;

public class maxNumberOfFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the five numbers:");
        int max = input.nextInt();
        for (int i = 0; i < 4; i++) {
            int current = input.nextInt();
            if (max<current){
                max = current;
            }
        }
        System.out.println("The biggest number is "+max);

    }

}
