import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete kordinatite na purvoto kvadratche ");
		int first=sc.nextInt();
		int first2=sc.nextInt();
		System.out.println("Vuvedete kordinatite na vtoroto kvadratche");
		int second=sc.nextInt();
		int second2=sc.nextInt();
		boolean colour,colour2;
		if((first%2!=0)&&(first2%2!=0)||((first%2==0)&&(first2%2==0))){
			colour=false;
		}
		else colour=true;
		
		if((second%2!=0)&&(second2%2!=0)||((second%2!=0)&&(second2%2!=0))){
			colour2=false;
		}
		else colour2=true;
		
		
		if(colour==colour2)System.out.println("Ednakvi sa!");
		else System.out.println("Ne sa ednakvi");
		}

	}