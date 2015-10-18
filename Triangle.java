
public class Triangle {
	private int triangleBase;
	private int triangleHeight;

	public void setBase(int width){
		this.triangleBase = width;
	}
	
	public void setHeight(int height){
		this.triangleHeight = height;
	}
	
	public double sumTriangle(){
		double sum;
		sum = (1/2) * triangleBase * triangleHeight;
		return sum;
	}
}
