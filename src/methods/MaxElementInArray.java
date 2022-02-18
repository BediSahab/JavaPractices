package methods;

public class MaxElementInArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		
		int length = max(a);
		System.out.println(length);
		
	}
	static int max(int a[])
	{
		return a.length;
	}
	
}
