package conditionalstatements;

import java.util.Scanner;

public class CalculatroSwitch {

	public static void main(String[] args) {
		System.out.println("Enter Two Numbers: ");
		Scanner s = new Scanner(System.in);
		int a = Integer.parseInt(s.nextLine());
		int b = Integer.parseInt(s.nextLine());
		System.out.println("Menu");
		System.out.println("1. ADD");
		System.out.println("2. SUB");
		System.out.println("3. MUL");
		System.out.println("4. DIV");
		System.out.println("Enter Options in words");
		String option = s.nextLine().toUpperCase();
		
		switch(option)
		{
		case "ADD": System.out.println("Output it: "+(a+b));
			break;
		case "SUB":System.out.println("Output it: "+(a-b));
			break;
		case "MUL":System.out.println("Output it: "+(a*b));
			break;
		case "DIV":
			if(b==0)
			{
				System.out.println("Invalid Division");	
				break;
			}
			System.out.println("Output it: "+(a/b));
			break;
		default:System.out.println("Invalid Options");
			break;
		}	
		s.close();
	}
}
