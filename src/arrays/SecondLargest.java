package arrays;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		//int key = s.nextInt();
		int a[] = {3,9,7,8,12,6,15,5,4,10};
		
		//sum of elements
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		System.out.println(sum);
		
		//searching an element
		/*for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				System.out.println("Element found at index: "+i);
				System.exit(i);
			}	
		}
		System.out.println("Element not found!");
		*/
		//max value
		int max =a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max = a[i];
			}
		}
		System.out.println(max);
		
		//second largest
		int max1=a[0];
		int max2=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max1<a[i])
			{
				max2 = max1;
				max1 = a[i];
			}
			else if(max2<a[i])
			{
				max2 = a[i];
			}
		}
		if(max1>max2)
			System.out.println("second largest is: "+max2);
		else
			System.out.println("second largest is: "+max1);
		s.close();
	}

}
