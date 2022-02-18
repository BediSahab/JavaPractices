package methods;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		System.out.println("HCF is: "+hcf(n1,n2));
		s.close();
	}
	static int hcf(int a,int b)
	{
		while(a!=b)
		{
			if(a>b)
				a=a-b;
			else
				b=b-a;
		}
		return a;	
		
	}
}
