package ConditionalStatements;

import java.util.Scanner;

public class signOfDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = input.nextDouble();
        System.out.println("Enter b:");
        double b = input.nextDouble();

        if((a<0 && b <0)||(a>0 && b>0)){
            System.out.println('+');
        }
        else{
            System.out.println('-');
        }
    }

}
