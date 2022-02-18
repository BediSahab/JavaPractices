package dataHiding;

public class RectangleExample {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		r.setLength(45);
		r.setBredth(33);
		
		double l=r.getLength();
		double b=r.getBredth();
		System.out.println(r.area(l, b));
	}

}
