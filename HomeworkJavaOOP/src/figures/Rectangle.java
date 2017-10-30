package figures;

public class Rectangle extends Shape{

	public Rectangle(float width, float height) {
		super(width, height);
	}

	@Override
	public double calculateSurface() {
		return (getHeight()*getWidth());
		
	}
}
