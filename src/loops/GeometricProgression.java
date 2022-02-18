package loops;

import java.util.Scanner;

public class GeometricProgression {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int r = s.nextInt();
		int n = s.nextInt();
		
		for(int i=1;i<+n;i++)
		{
			System.out.println(a*Math.pow(r, i-1));
		}
		s.close();
	}

}
