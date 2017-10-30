package chapter3;

import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enetr y:");
        int y = input.nextInt();
        System.out.println("Enetr x:");
        int x = input.nextInt();
        boolean isInside =true;
        if(x * x + y * y <= 5 && (x*x) + (y*y) > 5){
            isInside=true;
        }
        else {
            isInside = false;
        }
        System.out.println(isInside);


    }
}
