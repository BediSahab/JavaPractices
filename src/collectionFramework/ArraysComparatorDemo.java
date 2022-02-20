package collectionFramework;

import java.util.Arrays;

public class ArraysComparatorDemo {

	public static void main(String[] args) {
		int a[] = {2,3,4,5,6,7};
		int b[] = {2,3,4,5,6,7};

		System.out.println(Arrays.compare(a, b));
		
		int c[]=Arrays.copyOf(a, 4);   //(a,a.length)
		Arrays.fill(c, 10);
		for(int x:c)
		{
			System.out.println(x);
		}
		Arrays.sort(a);
		for(int x:a)
		{
			System.out.println(x);
		}
		
	}

}
