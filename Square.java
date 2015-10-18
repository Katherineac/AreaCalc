
public class Square {
	private int squareLength;

	public void setLength(int length){
		this.squareLength = length;
	}
	
	public double sumSquare(){
		double sum;
		sum = Math.pow(squareLength, 2);
		return sum;
	}
}
