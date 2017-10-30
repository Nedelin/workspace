package chapter2;

import java.util.Scanner;

public class exersice9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name?");
        String a = input.next();
        System.out.println("What is your last name?");
        String b = input.next();
        System.out.println("What is your age?");
        String c = input.next();
        System.out.println("Are you male or female?");
        String d = input.next();
        System.out.println("What is your ID?");
        int n = input.nextInt();
        System.out.println("What is your unique number?");
        int m = input.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(n);
        System.out.println(m);


    }
}
