
public class Circle {
	private int circleRadius;

	public void setRadius(int radius){
		this.circleRadius = radius;
	}
	
	public double sumCircle(){
		double sum;
		double roundedSum;
		double sum100;
		sum = Math.PI * Math.pow(circleRadius, 2);
		sum100 = sum * 100;
		roundedSum = Math.round(sum100);
		return roundedSum/100;
	}
}
