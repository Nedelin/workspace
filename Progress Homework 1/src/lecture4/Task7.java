package lecture4;

public class Task7 {

	public static void main(String[] args) {
		int a =22;
		int b= 33;
		int c =44;
		int d = 55;
		int e = 101;
		int help = 0;
		int help1= 0;
		int help2 = 0;
		
		if(a>b){
			help=a;
		}
		if(b>a){
			help=b;
		}
		if(c>d){
			help1 = c;
		}
		if(d>c){
			help1 = d;
		}
		if(help>help1){
			help2=help;
			if(help2>e){
				if(a>b){
					System.out.println("Chisloto A e nai golqmo");
				}
				if(a<b){
					System.out.println("Chisloto B e nai golqmo");
				}
			}
			if(help<e){
				System.out.println("Chisloto E e nai golqmo");
			}
		}
		if(help1>help){
			help2=help1;
			if (help2>e){
				if(c>d){
					System.out.println("Chisloto C e nai golqmo");
				}
				if(d>c){
					System.out.println("Chisloto D e nai golqmo");
				}
			}
			if(help2<e){
				System.out.println("Chisloto E e nai golqmo");
			}
		}
	}

}
