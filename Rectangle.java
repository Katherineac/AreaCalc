
public class Rectangle implements Shape {
	private double rectangleBase;
	private double rectangleHeight;

	public Rectangle(double width, double height){
		rectangleBase = width;
		rectangleHeight = height;
	}
	
	public double getArea(){
		return rectangleBase * rectangleHeight;
	}
}
