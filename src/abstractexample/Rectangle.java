package abstractexample;

public class Rectangle extends Shape{

	double l,b;
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(l+b);
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return l*b;
	}

}
