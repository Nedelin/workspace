package rally;

public class Car {
	
	private String mark;
	private String model;
	private String color;
	private int avgSpeed;
	
	public Car(String mark, String model, String color, int avgSpeed){
		this.mark  = mark;
		this.model = model;
		this.color = color;
		this.avgSpeed = avgSpeed;
	}
	public String getMark(){
		return mark;
	}
	public int getavgSpeed(){
		return avgSpeed;
	}
	public void winner(){
		System.out.println(mark +  " is the winner with  average speed: "+ avgSpeed);
	}
	

}
