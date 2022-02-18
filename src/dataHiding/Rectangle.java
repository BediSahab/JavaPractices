package dataHiding;

public class Rectangle {

	private double length;
	private double bredth;
	
	//getter setter
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBredth() {
		return bredth;
	}
	public void setBredth(double bredth) {
		this.bredth = bredth;
	}
	//area
	public double area(double length,double bredth)
	{	
		return length*bredth;
	}
}
