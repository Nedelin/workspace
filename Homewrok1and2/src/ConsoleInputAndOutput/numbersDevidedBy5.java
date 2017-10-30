package ConsoleInputAndOutput;

import java.util.Scanner;

public class numbersDevidedBy5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = input.nextInt();
        System.out.println("Enter y:");
        int y = input.nextInt();
        int count = 0;
        for(int i=x; i<=y; i++){
            if(i%5 ==0){
                count++;
            }

        }
        System.out.println(count);
    }
}
