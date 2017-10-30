package lecture5;

public class Task1 {

	public static void main(String[] args) {
		int a = 102;
		int b =20;
		int help=0;
		if (a>b){
			help = b;
			b=a;
			a=help;
			System.out.println("Stoinostite na chislata sa razmeneni - A="+a+" i B="+b);
		}else{
			System.out.println("Stoinostite ne sa razmeneni");
		}
	}

}
