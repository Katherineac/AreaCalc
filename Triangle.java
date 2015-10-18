
public class Triangle implements Shape{
	private double triangleBase;
	private double triangleHeight;

	public Triangle(double width, double height){
		triangleBase = width;
		triangleHeight = height;
	}
	
	public double getArea(){
		return (1/2) * triangleBase * triangleHeight;
	}
}
