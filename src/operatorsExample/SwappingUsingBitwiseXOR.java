package operatorsExample;

import java.util.Scanner;

public class SwappingUsingBitwiseXOR {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		
		x=x^y;
		y=x^y;
		x=x^y;
		
		System.out.println("Swapped numbers are: "+x+" "+y);
		s.close();
	}

}
