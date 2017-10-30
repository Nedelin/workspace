import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete tricifreno chislo ");
		int a= sc.nextInt();
		int br = 0;
		if (a<100 || a>999){
			System.out.println("Greshen vhod !");
		}else{
			int num1=a/100;
			int num2=a/10%10;
			int num3=a%10;
		if(num1==0 || num2==0 || num3==0){
			System.out.println("V chisloto ne trqbva da ima 0 !");
		}else {
			if(a%num1==0)br++;
			if(a%num2==0)br++;
			if(a%num3==0)br++;
		}
		if(br==3){
			System.out.println("Deli se na vsichkite si cifri!");
		}else
			System.out.println("Ne se deli na vsichkite si cifri!");
		}
		
		
	}
}
