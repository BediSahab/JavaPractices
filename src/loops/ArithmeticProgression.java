package loops;

import java.util.Scanner;

public class ArithmeticProgression {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int d = s.nextInt();
		int n = s.nextInt();
		
		for(int i=0; i<n; i++)
		{
			System.out.println(a+i*d);
		}
		s.close();
	}

}
