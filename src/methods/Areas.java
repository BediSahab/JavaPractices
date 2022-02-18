package methods;

public class Areas {

	
	static double area(double l, double b)
	{
		return l*b;
	}
	static double area(double r)
	{
		return Math.PI * r*r;
	}
	public static void main(String[] args) {
		
		System.out.println("Area of Rectangle: "+area(14,17));
		System.out.println("Area of circle: "+area(7));
		
	}

}
