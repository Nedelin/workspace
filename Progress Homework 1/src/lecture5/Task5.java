package lecture5;

public class Task5 {

	public static void main(String[] args) {
		int a=2;
		int b=4;
		int c=1;
		int D = b*b-4*a*c;
		double x1=(-b+Math.sqrt(D)/2*a);
		double x2=(-b-Math.sqrt(D)/2*a);
		
		if(D<0){
			System.out.println("Uravnenieto nqma realni koreni");
		}
		if(D==0){
			System.out.println("Uravnenieto ima dva ednakvi korena i te sa ravni na:"+x1);
		}
		if(D>0){
			System.out.println("Uravnenieto ima dva korena x1:"+x1+" i x2:"+x2);
		}
	}

}
