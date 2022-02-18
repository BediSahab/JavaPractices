package conditionalstatements;

import java.util.Scanner;

public class Radix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String number = s.nextLine();
		
		if(number.matches("[01]+"))
		{
			System.out.println("Binary Number");
		}
		else if(number.matches("[0-7]+"))
		{
			System.out.println("Octal Number");
		}
		else if(number.matches("[0-9]+"))
		{
			System.out.println("Decimal Number");
		}
		else if(number.matches("[0-9A-F]+"))
		{
			System.out.println("Hexadecimal Number");
		}
		else
			System.out.println("Invalid Number");
		s.close();
	}

}
