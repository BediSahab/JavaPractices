package loops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int first = 0,second=1,sum;
		System.out.println(first);
		System.out.println(second);
		
		for(int i=0;i<n;i++)
		{	
			sum=first+second;
			System.out.println(sum);
			first=second;
			second=sum;
		}
		s.close();
	}

}
