package string;

public class StringChallange {

	public static void main(String[] args) {
		
		String str = "programmer@gmail.com";
		
		if(str.matches(".*gmail.*"))
		{
			System.out.println("email is gmail");
		}
		int i = str.indexOf("@");
		String str1 = str.substring(0, i);
		String str2 = str.substring(i+1, str.length());
		System.out.println(str1+" "+str2);

	}

}
