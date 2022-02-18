package inheritance;

public class CircleCylinderTest {

	public static void main(String[] args) {

		
		Cylinder c2 = new Cylinder();
		
		c2.setRadius(7);
		c2.setHeight(14);
		
		
		System.out.println(c2.volume());
		System.out.println(c2.area());

	}

}
