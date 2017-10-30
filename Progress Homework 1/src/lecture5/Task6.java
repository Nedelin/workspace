package lecture5;

public class Task6 {

	public static void main(String[] args) {
		int a= 10;
		int b =20;
		int c = 39;
		int d=153;
		int e=222;
		
		if(a>b&&a>c&&a>d&&a>e){
			System.out.println("Chisloto A e nai golqmo - A="+a);
		}
		if(b>a&&b>c&&b>d&&b>e){
			System.out.println("Chisloto B e nai golqmo - B="+b);
		}
		if(c>a&&c>b&&c>d&&c>e){
			System.out.println("Chisloto C e nai golqo - C="+c);
		}
		if(d>a&&d>b&&d>c&&d>e){
			System.out.println("Chisloto D e nai golqo - D="+d);
		}
		if(e>a&&e>b&&e>c&&e>d){
			System.out.println("Chisloto E e nai golqo - E="+e);
		}

	}

}
