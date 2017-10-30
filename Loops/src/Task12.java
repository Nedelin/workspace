public class Task12 {

	public static void main(String[] args) {
		int a,b,c;
		
		for(int i=100;i<=999;i++){
			a=i/100;
			b=i/10%10;
			c=i%10;
			if(a!=b&&a!=c&&b!=c) System.out.println(i);
		}

	}

}
