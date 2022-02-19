package innerClass;

public class Test {

	public static void main(String[] args) {
		
		Outer o = new Outer();
		o.outerDisplay();
		
		Outer.Inner oi = new Outer().new Inner();
		oi.innerDisplay();
	}

}
