package string;

public class StringMethods {

	public static void main(String[] args) {
		
		String str = "Java";
		
		int l = str.length();
		String lowerCase = str.toLowerCase();
		String upperCase = lowerCase.toUpperCase();
		
		System.out.println(l+" "+lowerCase+" "+upperCase);
		
		String str2 = "     Welcome       ";
		String trimmed = str2.trim();
		System.out.println(trimmed);
		String substring1 = trimmed.substring(3);
		String substring2 = trimmed.substring(1,4);
		System.out.println(substring1);
		System.out.println(substring2);
		
		String replaced = trimmed.replace("e", "z");
		System.out.println(replaced);
		
		String str3 = "My First Program";
		String[] splitted = str3.split(" ");
		
		for(String s: splitted)
		{
			System.out.print(s);
		}
		
				

	}

}
