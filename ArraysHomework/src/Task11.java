import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete goelminata na masiva : ");
		int a = sc.nextInt();
		int[] arr = new int[a];
		System.out.println("Vuvedete chislata v  masiva");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
	}
		int br = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>5&& arr[i]%5 == 0){
				System.out.println(arr[i]);
				br++;
				
			}
		}
		System.out.println(br+ " chisla");
	}

}
