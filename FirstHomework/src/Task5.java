import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Purvo chislo: ");
		int a = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Vtoro chislo: ");
		int b = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Treto chislo: ");
		int c = sc2.nextInt();
	
		if ((a < b && a < c))
        {
            if(b < c)
            {
                System.out.print(c + " " + b + " " + a);
            }
            else
                System.out.print(b + " " + c + " " + a);
        }
        else 
        	if ((b < a && b < c))
        {
            if(a < c)
            {
                System.out.print(b + " " + a + " " + a);
            }
            else
                {
                System.out.print(a + " " + c + " " + b);
                }
        }
        else 
        	if ((c < a && c < b))
        {
            if(a < b)
            {
                System.out.print(b + " " + a + " " + c);
            }
            else
                System.out.print(a + " " + b + " " + c);
        }
        else
        {
            System.out.println("Vsichki chisla sa ednakvi! ");
        }

    }

}
