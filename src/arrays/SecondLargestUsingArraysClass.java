package arrays;

import java.util.Arrays;

public class SecondLargestUsingArraysClass {

	public static void main(String[] args) {
		int a[] = {3,9,7,8,12,6,15,5,4,10};
		
		Arrays.sort(a);
		int max = a[a.length-1];
		int secondlargest = a[a.length-2];
		
		System.out.println("Max is: "+max);
		System.out.println("Second Largest is: "+secondlargest);
	}

}
