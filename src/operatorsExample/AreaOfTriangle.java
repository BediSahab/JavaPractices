package operatorsExample;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		float h = s.nextFloat();
		float b = s.nextFloat();
		float area;
		
		area = (h*b)/2;
		System.out.println("Area of Triangle is: "+area);
		s.close();
	}

}
