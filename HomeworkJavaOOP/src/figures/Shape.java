package figures;

public abstract class Shape {
	private float width;
	private float height;

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	

	public Shape(float width, float height) {
		this.width = width;
		this.height = height;
	}
	public Shape(){
		
	}
	
	public abstract double calculateSurface();
}
