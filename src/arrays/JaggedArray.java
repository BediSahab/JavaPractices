package arrays;

public class JaggedArray {
	public static void main(String[] args) {
		
		int a[][] = new int[3][];
		a[0]=new int[2];
		a[1]=new int[4];
		a[2]=new int[3];
		
		
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print(y);
			}
			System.out.println();
		}

	}
}
