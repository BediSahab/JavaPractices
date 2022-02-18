package operatorsExample;

import java.util.Scanner;

public class AreaOfTriangleHeronsFormula {

	public static void main(String[] args) {
		
		System.out.println("Enter sides of triangle");
		Scanner s = new Scanner(System.in);
		float a = s.nextFloat();
		float b = s.nextFloat();
		float c = s.nextFloat();
		float S,Area;
		
		S=(a+b+c)/2;
		Area = (float) Math.sqrt(S*(S-a)*(S-b)*(S-c));
		System.out.print("Area of Triangle is: "+Area);
		s.close();

	}

}
