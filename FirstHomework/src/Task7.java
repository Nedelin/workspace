import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Kolko e chasa: ");
		int chas = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Kolko pari imam? ");
		double pari = sc1.nextDouble();
		if(pari>10){
			System.out.println("Shte si kupq lekarstva");
			}
		if(pari<0.01){
	    	System.out.println("Shte si stoq vkushti i shte piq chai.");
	    	
	    }
		
		if(pari<10){
		    	System.out.println("Shte otida na kafe");
		    }
		    
	
		
		System.out.println("Zdrav li sum ? True or False?");
		Scanner sc2 = new Scanner(System.in);

		if(sc2.nextBoolean()==true) {
		    System.out.println("Shte otida na kino s priqteli.");
		} else {
		    System.out.println("Nqma da izlizam.");
		}
	}
}

