package operatorsExample;

import java.util.Scanner;

public class Cuboid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length, bredth and height of cuboid:");
		int length = s.nextInt();
		int bredth = s.nextInt();
		int height = s.nextInt();
		
		double volume = length*bredth*height;
		double surfaceArea = 2*(length+bredth)*height;
		double totalSurfaceArea = 2*(length*bredth + bredth*height + height*length);
		
		System.out.println("Volume: "+volume);
		System.out.println("Surface Area: "+surfaceArea);
		System.out.println("Total Surface Area: "+totalSurfaceArea);
		s.close();
	}

}
