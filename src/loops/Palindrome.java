package loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int rem, revnum=0,temp=n;;
		while(temp>0)
		{	
			
			rem=temp%10;
			revnum= revnum*10+rem;
			temp=temp/10;
		}
		System.out.println("Reverse of "+n+" is: "+revnum);
		if(revnum==n)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		s.close();
	}

}
