import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
	int kofa1 = 2;
	int kofa2 = 3;
	Scanner sc = new Scanner(System.in);
	System.out.println("Vuvedete obem ot 10 - 9999 ! ");
	int obem= sc.nextInt();
	if(obem<10 || obem>9999){
		System.out.println("Greshen obem !");
	}
	int c = obem/(kofa1+kofa2);
	if(obem%(kofa1+kofa2)==1){
		System.out.println((c-1)+" kofi po dva litra "+(c+1)+" kofi po 3 litra.");
		
	}
	if(obem%(kofa1+kofa2)==2){
		System.out.println((c+1)+" kofi po dva litra "+c+" kofi po 3 litra.");

	}
	if(obem%(kofa1+kofa2)==3){
		System.out.println(c+" kofi po dva litra "+(c+1)+" kofi po 3 litra.");
		
	}
	if(obem%(kofa1+kofa2)==0){
		System.out.println(c+" kofi po dva litra "+c+" kofi po 3 litra.");
	}
	if(obem%(kofa1+kofa2)==4){
		System.out.println((c+2)+" kofi po dva litra "+c+" kofi po 3 litra.");
	}
	}
	

}
