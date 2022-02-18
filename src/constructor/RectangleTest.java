package constructor;

public class RectangleTest {

	public static void main(String[] args) {
		RectangleConstructor r = new RectangleConstructor();
		System.out.println("Area is: "+r.area());
		
		RectangleConstructor r1 = new RectangleConstructor(12,23);
		System.out.println("Area is: "+r1.area());

	}

}
