package constructor;

public class CylinderConstructor {

	private double radius;
	private double height;
	
	public CylinderConstructor()
	{
		radius = 1;
		height = 1;
	}
	public CylinderConstructor(double radius)
	{
		this.radius = radius;
		height = 1;
	}
	public CylinderConstructor(double radius,double height)
	{
		this.radius = radius;
		this.height = height;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	//methods
	
	public double volume()
	{
		return Math.PI*radius*radius*height;
	}
	public double totalArea()
	{
		return Math.PI*2*radius*(height+radius);
	}
	public double surfaceArea()
	{
		return Math.PI*2*radius*height;
	}
}
