package aRandom;

public class CharacterLowerUpper {

	public static void main(String[] args) {
		 String str1="Great Power";  
	     String str2="";
	     for(int i=0;i<str1.length();i++)
		 {
			 if(Character.isLowerCase(str1.charAt(i)))
			 {
				str2=str1.replace(str1.charAt(i), Character.toUpperCase(str1.charAt(i)));
			 }
			 else if(Character.isUpperCase(str1.charAt(i)))
			 {
				str2=str1.replace(str1.charAt(i), Character.toLowerCase(str1.charAt(i)));
			 }	 
		 }
		 
		 System.out.println(str2);
	}

}
