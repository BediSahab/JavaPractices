package string;

public class StringChallangeTwo {

	public static void main(String[] args) {
		
		int b = 10110001;
		String str = String.valueOf(b);   // changing int to string using valueOf() method
		
	//String str = Integer.toString(b); // changing int to string using toString() method
		
		System.out.println(str.matches("[01]*"));

	}

}
