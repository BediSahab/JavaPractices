package patternWithNestedLoops;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i<j)
					System.out.print("  ");
				else
					System.out.print("* "); //2 spaces
			}
			System.out.println();
		}
		s.close();

	}

}
