package loops;

import java.util.Scanner;

public class PrintDigitInWord {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n = s.nextLine();
		
		for(int i=0;i<n.length();i++)
		{
			char c = n.charAt(i);
			switch(c)
			{
			case '0': System.out.print("Zero ");
				break;
			case '1': System.out.print("One ");
				break;
			case '2': System.out.print("Two ");
				break;
			case '3': System.out.print("Three ");
				break;
			case '4': System.out.print("Four ");
				break;
			case '5': System.out.print("Five ");
				break;
			case '6': System.out.print("Six ");
				break;
			case '7': System.out.print("Seven ");
				break;
			case '8': System.out.print("Eight ");
				break;
			case '9': System.out.print("Nine ");
				break;
			default: System.out.println("Invalid");
			}
		}
		s.close();
		

	}

}
