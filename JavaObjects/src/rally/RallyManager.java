package rally;

public class RallyManager {

	public static void main(String[] args) {
		Car firstCar = new Car("Audi","A3","red",170);
		Car secondCar = new Car("BMW","X5","black",190);
		Car thirdCar = new Car("VW","Touran","green",1100);
		
		
		if(firstCar.getavgSpeed()> secondCar.getavgSpeed()){
			firstCar.winner();
		}
		else if(secondCar.getavgSpeed()>thirdCar.getavgSpeed()){
			secondCar.winner();
		}else{
			thirdCar.winner();
		}
		
	}
	

}
