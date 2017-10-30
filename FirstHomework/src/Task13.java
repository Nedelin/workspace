import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete temperatura ");
		int temp= sc.nextInt();
		if(temp<=-100 || temp>=100){
			System.out.println("Greshna temperatura !");
		}else{

		if (temp<-20){
			System.out.println("Vremeto e ledeno studeno");
		} 	if (temp<=0 && temp>=-20){
			System.out.println("Vremeto e studeno");
		}
		if(temp>0 && temp<=15){
			System.out.println("Vremeto e hladno");
		}
		if(temp>15 && temp<=25){
			System.out.println("Vremeto e toplo");
		}
		if(temp>25){
			System.out.println("Vremeto e goreshto");
		}
		
	}

}
}


