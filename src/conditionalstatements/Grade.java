package conditionalstatements;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float m1 = s.nextFloat();
		float m2 = s.nextFloat();
		float m3 = s.nextFloat();
		
		double total = m1+m2+m3;
		double avg = total/3;
		
		if(avg>=70)
		{
			System.out.println("Grade is: A");
		}
		else if(avg>=60 && avg<70)
		{
			System.out.println("Grade is: B");
		}
		else if(avg>=50 && avg<60)
		{
			System.out.println("Grade is: C");
		}else if(avg>=40 && avg<50)
		{
			System.out.println("Grade is: D");
		}
		else
			System.out.println("Grade is: F");
		s.close();
	}

}
