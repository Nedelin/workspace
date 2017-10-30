package figures;

public class Circle extends Shape{
	private float radius;

	public Circle(float height, float radius){
		super(height,height);
		this.radius = radius;
		
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	@Override
	public double calculateSurface() {
		return Math.PI*(radius*radius);
		
	}

}
