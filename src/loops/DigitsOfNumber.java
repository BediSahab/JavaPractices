package loops;

import java.util.Scanner;

public class DigitsOfNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int temp=n,remainder,count=0;;
		while(temp!=0)
		{
			remainder = temp%10;
			count++;
			System.out.println(remainder);	
			temp = temp/10;
		}
		System.out.println("Number of digits are: "+count);
		s.close();
	}

}
