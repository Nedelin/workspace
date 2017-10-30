package chapter3;

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enetr n:");
        int n = input.nextInt();
        int a = (n/1000)%10;
        int b = (n/100) %10;
        int c = (n/10)%10;
        int d = n%10;
        int sumDigits = a + b + c +d;
        System.out.println(sumDigits);
        System.out.println(d +" "+c+" "+ b +" "+a);
        System.out.println(d +" "+a+" "+ b +" "+c);
        System.out.println(a +" "+c+" "+ b +" "+d);
    }
}
