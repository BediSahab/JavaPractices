package loops;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String str = Integer.toString(n);
		
		int rem, temp=0;
		for(int i=0;i<str.length();i++)
		{
			rem = n%10;
			temp = (int) (temp + Math.pow(rem, str.length()));
			n=n/10;
		}
		if(temp==Integer.parseInt(str))
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
		
		
		s.close();
	}

}
