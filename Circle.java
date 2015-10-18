
public class Circle implements Shape{
	private double circleRadius;

	public Circle(double radius){
		circleRadius = radius;
	}
	
	public double getArea(){
		return Math.round(Math.PI * Math.pow(circleRadius, 2));
	}
}
