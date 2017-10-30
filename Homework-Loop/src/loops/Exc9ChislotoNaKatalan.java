package loops;

import java.util.Scanner;

public class Exc9ChislotoNaKatalan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Molq vuvedete chisloto N:");
		int n = input.nextInt();
		int dvePoNFac = 1;
		int nPlusEdnoFac = 1;
		int nFac = 1;
		int cKatalan = 0;
		
		for (int i = 0; i < n; i++) {
			dvePoNFac = (2*dvePoNFac)*i;
			nPlusEdnoFac = (nPlusEdnoFac+1)*i;
			nFac=nFac*i;

			
		}
		System.out.println(dvePoNFac);
		System.out.println(nPlusEdnoFac);
		System.out.println(nFac);
		System.out.println(cKatalan);
	}

}
