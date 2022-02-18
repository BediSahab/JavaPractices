package inheritance;

public class SuperSubTest {

	public static void main(String[] args) {
		Super sup = new Super();
		sup.display();
		
		Sub sb = new Sub();
		sb.display();
		
		Super sp = new Sub();   //dynamic method dispatch
		sp.display();

	}

}
