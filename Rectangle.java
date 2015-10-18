
public class Rectangle {
	private int rectangleBase;
	private int rectangleHeight;

	public void setBase(int width){
		this.rectangleBase = width;
	}
	
	public void setHeight(int height){
		this.rectangleHeight = height;
	}
	
	public double sumRectangle(){
		double sum;
		sum = rectangleBase * rectangleHeight;
		return sum;
	}
}
