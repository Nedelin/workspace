package ConditionalStatements;

import java.util.Scanner;

public class quadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = input.nextDouble();
        System.out.println("Enter b:");
        double b = input.nextDouble();
        System.out.println("Enter c:");
        double c = input.nextDouble();
        double x1=0;
        double x2=0;
        double D = Math.sqrt((b*b)-(4*a*c));
        if(D ==0){
            x1=x2= -b/2*a;

        }
        else if(D>0){
            x1 = (-b+D)/2;
            x2 = (-b-D)/2;

        }
        else{
            System.out.println("The equation has no x1 or x2");
        }
        System.out.println(x1);
        System.out.println(x2);
    }

}
