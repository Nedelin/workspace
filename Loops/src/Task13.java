
import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Vuvedete chislo ot 1 do 27");
		int sum=sc.nextInt();

int a,b,c;
for(int i=100;i<=999;i++){
	a=i/100;
b=i/10%10;
c=i%10;
if(a+b+c==sum) System.out.println(i);
	}

	if(sum>27 && sum<0){
		System.out.println("Chisloto ne e v intervala!");
	}
}
}