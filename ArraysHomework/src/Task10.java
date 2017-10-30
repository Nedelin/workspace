import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete goelminata na masiva : ");
		int a = sc.nextInt();
		int[] arr = new int[a];
		System.out.println("Vuvedete chislata v  masiva");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
	}
		
		double min = 99999;
		double sum = 0;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		double avr = sum/7;
		for (int i = 0; i < arr.length; i++) {
			if(min>avr-arr[i]){
				min=avr-arr[i];
				index=i;
			}
		}
		System.out.println(arr[index]);
	}
	
	

}
