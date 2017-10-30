import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete tricifreno chislo ");
		int chislo= sc.nextInt();
		int br = 0;

		if(chislo<100 || chislo>999){
			System.out.println("Chisloto ne e v intervala!");
	}else
	{
		int a = chislo/100;
		int b = chislo/10%10;
		int c = chislo%10;
		if(a==b && b==c){br++;
			System.out.println("Cifrite sa ravni");
			
		}
		if(a>b && b>c){br++;
			System.out.println("Cifrite sa vuv vuzhodqsht red");
			br++;
		}
		if(a<b && b<c){br++;
			System.out.println("Cifrite sa v nizhodqsht red");
			
		}
		if (br==0){
			System.out.println("Cifrite sa nenaredeni, za neopisanite sluchai");
		}
		}
		}

}


