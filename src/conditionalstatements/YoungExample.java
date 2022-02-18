package conditionalstatements;

import java.util.Scanner;

public class YoungExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		
		if(age>=14&&age<=55)
		{
			System.out.println("Young");
		}
		else
			System.out.println("Not Young");
		s.close();
	}

}
