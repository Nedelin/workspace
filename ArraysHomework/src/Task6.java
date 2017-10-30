import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete goelminata na purviq masiv : ");
		int a = sc.nextInt();
		System.out.println("Vuvedete goelminata na vtoriq masiv: ");
		int b = sc.nextInt();
		
		int[] arr = new int[a];
		int[] arr2= new int[b];
		int br=0;
		System.out.println("Vuvedete chislata v purviq masiv");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Vuvedete chislata vuv vtoriq masiv");
		for (int j = 0; j < arr2.length; j++) {
			arr2[j] = sc.nextInt();
			
		}
		if(a!=b){
			System.out.println("Ne sa ednakvi." );
			
		}
		else{
			for (int i = 0; i < arr2.length; i++) {
				if(arr[i]==arr2[i]){
					br++;
				}
		}
			if(br==a){
				System.out.println("Ednakvi sa");
			}else{
				System.out.println("Ne sa ednakvi");
			}
		}


	}

}
