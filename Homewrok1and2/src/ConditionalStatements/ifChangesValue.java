package ConditionalStatements;

import java.util.Scanner;

public class ifChangesValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = input.nextInt();
        System.out.println("Enter b:");
        int b = input.nextInt();
        if(a>b){
            int temp =a;
            a=b;
            b= temp;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
