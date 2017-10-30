package lecture5;

public class Task8 {

	public static void main(String[] args) {
		int tochki = 0;
		
		if(tochki>=1 && tochki<=3){
			tochki=tochki*10;
			System.out.println("Tochkite sa "+tochki);
		}
		if(tochki>=4 && tochki<=6){
			tochki = tochki*100;
			System.out.println("Tochkite sa "+tochki);
		}
		if(tochki>=7 && tochki<=9){
			tochki=tochki*1000;
			System.out.println("Tochkite sa "+tochki);
		}
		if(tochki<=0 || tochki>9){
			System.out.println("Tochkite sa greshni");
		}
	}

}
