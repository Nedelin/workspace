package ConsoleInputAndOutput;

import java.util.Scanner;

public class informationForCompany {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Name of the company:");
        String name = input.next();
        System.out.println("Address of the company:");
        String address = input.next();
        System.out.println("Mobile number of the company:");
        int mobile = input.nextInt();
        System.out.println("Fax of the company:");
        int fax = input.nextInt();
        System.out.println("Website of the company:");
        String website = input.next();
        System.out.println("First name of the manager of the company:");
        String mangerFirstName = input.next();
        System.out.println("Last name of the manager of the company:");
        String mangerLastName = input.next();
        System.out.println("Mobile number of the manager of the company:");
        int mangerMobile = input.nextInt();

        System.out.printf("The name of the company is %S. \n", name);
        System.out.printf("The address of the company is %S. \n", address);


    }
}
