package chapter3;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
      boolean fiveSeven = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();

        if(n%5==0 && n%7==0){
            fiveSeven = true;


    }
    else{
            fiveSeven = false;
        }
    System.out.println(fiveSeven);
    }

    }

