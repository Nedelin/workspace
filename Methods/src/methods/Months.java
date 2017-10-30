package methods;

import java.util.Scanner;

public class Months {

	public static void main(String[] args) {
		int month = validate();
		System.out.println(getMonthByNumber(month));
	}

	static String getMonthByNumber(int n) {
			
		switch (n) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "Invalid month";

		}
	}
	static int validate (){
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();
		while(n<1 || n>12){
			System.out.println("Please enter number from 1 to 12");
			n = input.nextInt();
		}
		return n;
		

}
}
