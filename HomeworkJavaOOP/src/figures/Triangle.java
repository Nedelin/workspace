package figures;

public class Triangle extends Shape {


	public Triangle(float width, float height) {
		super(width, height);
	}

	@Override
	public double calculateSurface() {
		return (getHeight()*getWidth());
		
	}



	
}
