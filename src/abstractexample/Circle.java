package abstractexample;

public class Circle extends Shape{

	double r;
	@Override
	public double perimeter() {
		return Math.PI*2*r;
		
	}

	@Override
	public double area() {
		return Math.PI*r*r;
		
	}

	
}
