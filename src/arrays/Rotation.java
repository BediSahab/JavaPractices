package arrays;

public class Rotation {

	public static void main(String[] args) {

		int a[] = {5,9,6,10,12,7,3,5,4,2};
		int b[] = {5,9,6,10,12,7,3,5,4,2};
		//left rotation
		int temp = a[0];
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
		for(int x:a)
		{
			System.out.println(x);
		}
		//right rotation
		int temp1 = b[b.length-1];
		for(int i=b.length-1;i>0;i--)
		{
			b[i]=b[i-1];
		}
		b[0]=temp1;
		for(int x:b)
		{
			System.out.println(x);
		}
	}

}
