package figures;

import java.util.Arrays;

public class TestFigures {

	public static void main(String[] args) {
		
		Circle circle = new Circle(100,100);
		Triangle triangle = new Triangle(5,3);
		Rectangle rectangle = new Rectangle(10,15);
		
		Shape [] shapes = {circle,triangle,rectangle};
		
		double [] area = {circle.calculateSurface(), triangle.calculateSurface(), rectangle.calculateSurface()};
		
		System.out.println(Arrays.toString(area));
 	}

}
