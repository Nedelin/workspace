import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete chislo: ");
		int num = sc.nextInt();
		if (num > 0) {
			for (int i = 3; i <= num * 3; i = i + 3) {
				System.out.print(i + "; ");
			}
		} 
		if(num<0) {
			for (int j = -3; j >= num * 3; j = j - 3) {
				System.out.print(j + "; ");

			}
			
			}
		if(num == 0){
			System.out.println("BIG ERROR !!!!!!!!!!");
		}
	}
}
	

