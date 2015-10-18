
public class Square implements Shape {
	private double squareLength;

	public Square(double length){
		squareLength = length;
	}
	
	public double getArea(){
		return Math.pow(squareLength, 2);
	}
}
