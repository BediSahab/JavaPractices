package methods;

import java.util.Scanner;

public class RecursionExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int sum = sumTillSingleDigit(n);
		System.out.println(sum);
		s.close();

	}
	public static int sumTillSingleDigit(int n)
	{
		int sum =0;
		if(n/10==0)
			return n;
		else
		{
			while(n>0)
			{
				sum = sum + (n%10);
				n=n/10;
			}
			if(sum/10==0)
				return sum;
			else
				return sumTillSingleDigit(sum);
		}
			
		
	}
	

}
