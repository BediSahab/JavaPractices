package lambda;

public class Demo2Parameters {

	public static void main(String[] args) {
		MyLambda2 my  = (s)->{System.out.println(s);};
		my.show("Hi");

		MyLambda3 m = (a,b)->{return a+b;};  //(a,b)->a+b; will work too 
		
		System.out.println(m.add(4, 5));
	}

}
