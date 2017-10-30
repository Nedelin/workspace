import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete goelminata na masiva: ");
		int a = sc.nextInt();
		int[] arr = new int[a];
		int br=0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int j = 0; j < arr.length/2; j++) {
			if(arr[j]==arr[a-j-1]){
				br++;
			}
			
		}
		if(br == (a/2)){
			System.out.println("Ogledalen e");
		}else{
			System.out.println("Ne e ogledalen");
		}
	}

}
