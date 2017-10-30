package loops;

import java.util.Scanner;

public class numeralSystem10to2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter N:");
        String binaryString = scanner.nextLine();
        System.out.println("Output: "+Integer.parseInt(binaryString,2));
    }
}







