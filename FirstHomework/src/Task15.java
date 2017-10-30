import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete chislo ot intervala 0-24 ");
		int chislo= sc.nextInt();
		if(chislo<0 || chislo>24){
			System.out.println("Chisloto ne e v intervala!");
		}else{

			if(chislo>=18 && chislo<=24){
				System.out.println("Dobur vecher");
			}
			if(chislo>=0 && chislo<=4){
				System.out.println("Dobur vecher");
			}
			if(chislo>4 && chislo<=9){
				System.out.println("Dobro utro");
			}
			if(chislo>9 && chislo <18){
				System.out.println("Dobur den");
			}
	}

	}
}

