import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ��� ����, ��������� �� 40 ������ � ����� �����.");
		String s1;
		String s2;
		do {
			System.out.println("�������� ����� ���:");
			s1 = sc.next();
		} while (s1.length() < 0 || s1.length() > 40);
		
		do {
			System.out.println("�������� ����� ���:");
			s2 = sc.next();
		} while (s2.length() < 0 || s2.length() > 40);
		
		System.out.println(s1.toUpperCase() + " " + s1.toLowerCase());
		System.out.println(s2.toUpperCase() + " " + s2.toLowerCase());
		
	}

}
