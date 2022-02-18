package operatorsExample;

import java.util.Scanner;

public class QuarditicEquation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter coeficients");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		double r1,r2;
		double D= b*b-(4*a*c);
		if(D==0)
		{
			r1=(-1*b)/(2*a);
			r2=r1;
			System.out.println("Roots are: "+r1+" "+r2);
		}
		else if(D>0)
		{
			r1=((-1*b)+Math.sqrt(D))/(2*a);
			r2=((-1*b)-Math.sqrt(D))/(2*a);
			System.out.println("Roots are: "+r1+" "+r2);
		}
		else
			System.out.println("No Real Roots");
		s.close();
	}

}
