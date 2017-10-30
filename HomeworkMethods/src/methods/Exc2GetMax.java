package methods;

import java.util.Scanner;

public class Exc2GetMax {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int a = scanner.nextInt();
        System.out.println("Please enter second number:");
        int b = scanner.nextInt();
        System.out.println("PLease enter third number:");
        int c = scanner.nextInt();
        System.out.println("The biggest number is "+maxNumber(a,b,c));
    }
    static int maxNumber(int a,int b, int c){
        int x =0;
        if(a>b&&a>c){
            x=a;
        }
        else if(b>a&&b>c){
            x=b;
        }
        else if(c>a && c>b){
            x=c;
        }
        return x;


    }
}