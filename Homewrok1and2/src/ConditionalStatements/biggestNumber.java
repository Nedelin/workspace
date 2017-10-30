package ConditionalStatements;

import java.util.Scanner;

public class biggestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = input.nextInt();
        System.out.println("Enter b:");
        int b = input.nextInt();
        System.out.println("Enter c:");
        int c = input.nextInt();
        int max=0;
        if(a>b && a>c){
             max = a;

        }
        else if(b>a && b>c){
            max = b;

        }
        else{
             max =c;
        }
        System.out.println("The biggest number is "+max);
    }

}
