package Loops;

import java.util.Scanner;

public class catlanNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter n:");
        long n = scanner.nextLong();
        long factorial1= 1;
        long factorial2 = 1;
        long factorial3 =1;
        long multiplication= 2*n;
        long sum = n + 1;

        for(int i =1; i<=multiplication; i++){
            factorial1= factorial1*i;
        }
        for(int i =1; i<=sum;i++){
            factorial2=factorial2*i;
        }
        for(int i=1;i<=n;i++){
            factorial3=factorial3*i;
        }
        long C= factorial1/(factorial2*factorial3);
        System.out.println("Catlan's numeber is: "+C);


    }

}
