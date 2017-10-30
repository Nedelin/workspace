package lecture4;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete imeto na firmata: ");
		String ime = input.nextLine();
		System.out.println("Vuvedete adresa na firmata: ");
		String adres = input.nextLine();
		System.out.println("Vuvedete telefona na firmata");
		int telnumber=input.nextInt();
		System.out.println("Vuvedete nomera na faksa na vashata firma:");
		int fax = input.nextInt();
		System.out.println("Vuvedete saita na firmata:");
		String saitt = input.nextLine();
		saitt = input.nextLine();
		System.out.println("Vuvedete imeto i familiqta na menidjura");
		String imeM = input.nextLine();
		System.out.println("Vuvedete nomera na menidjura");
		int telnumberM = input.nextInt();
		
		System.out.printf("Imeto na firmata e %s i adresa e %s. Telefoniq nomere e %d i nomera na faksa e %d. Saita e %s. Imeto i familiqta na menidjura e %s i negoviq nomer e %d",ime,adres,telnumber,fax,saitt,imeM,telnumberM);
		
	}

}
