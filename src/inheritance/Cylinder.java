package inheritance;

public class Cylinder extends Circle{

	private double height;
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double volume()
	{
		return area()*height;
	}
}
