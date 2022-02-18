package inheritance;

public class DynamicMethodDispatch {

	public static void main(String[] args) {

		SuperClass s = new ChildClass();
		s.Math1();
		s.Math2();
		//s.Math3();     //not valid

	}

}
