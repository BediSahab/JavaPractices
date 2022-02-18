package methods;

import java.util.Scanner;

public class Reverse {

	int reverse(int n)
	{
		int rev=0;
		while(n>0)
		{
			rev = rev*10+(n%10);
			n=n/10;
		}
		return rev;
	}
	
	void reverse(int a[])
	{
		for(int i=0,j=a.length-1; i<(a.length)/2;i++,j--)
		{
			int temp=a[j];
			a[j]=a[i];
			a[i]=temp;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int reverse;
		int[] a = {1,2,3,4,5};
		
		Reverse r = new Reverse();
		reverse = r.reverse(n);
		System.out.println(reverse);
		
		r.reverse(a);
		for(int x:a)
		{
			System.out.println(x);
		}
		s.close();
	}

}
