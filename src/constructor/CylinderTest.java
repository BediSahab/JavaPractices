package constructor;

public class CylinderTest {

	public static void main(String[] args) {
		//default constructor
		CylinderConstructor c = new CylinderConstructor();
		System.out.println(c.surfaceArea());
		System.out.println(c.volume());
		System.out.println(c.totalArea());
		
		//with 1 parameter
		CylinderConstructor c1 = new CylinderConstructor(7);
		System.out.println(c1.surfaceArea());
		System.out.println(c1.volume());
		System.out.println(c1.totalArea());
		
		//with 2 parameter
		CylinderConstructor c2 = new CylinderConstructor(7,14);
		System.out.println(c2.surfaceArea());
		System.out.println(c2.volume());
		System.out.println(c2.totalArea());
	}

}
