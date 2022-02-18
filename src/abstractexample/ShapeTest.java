package abstractexample;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		r.l =10;
		r.b =20;
		System.out.println(r.area());
		System.out.println(r.perimeter());
		
		Circle c = new Circle();
		c.r=7;
		System.out.println(c.area());
		System.out.println(c.perimeter());
	}

}
