package chapter3;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        int b = n/100;
        int c = b%10;

        if(c==7){
            System.out.println("The third number is 7");
        }
        else{
            System.out.println("The third number is not 7 is"+" "+ c);
        }
    }
}
