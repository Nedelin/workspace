import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete goelminata na masiva : ");
		int a = sc.nextInt();
		int[] arr = new int[a];
		System.out.println("Vuvedete chislata v  masiva");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
	}
		int br = 1;
		int max =1;
		int index =0;
		for (int i = 0; i < arr.length-1; i++) {
			
			if(arr[i]==arr[i+1]){
				br++;
		}
		else{
				if(br>max){
					max=br;
					index=i;
					br=1;
					
				}
			}

			
		}
		for (int i = index; i > index -max ; i--) {
			System.out.println(arr[i]);
			
		}
		
	
	}

}
