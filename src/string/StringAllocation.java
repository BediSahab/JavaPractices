package string;

public class StringAllocation {

	public static void main(String[] args) {
		
		String str1 = "Java";
		String str2 = "Java";
		
		String str3 = new String("Java");
		
		boolean compare1 = str1==str2; //comparing reference 
		boolean compare2 = str1.equalsIgnoreCase(str3); //comparing value
		boolean compare3 = str1==str3; //comparing reference 
		System.out.println(compare1+" "+compare2+" "+compare3);
		
		byte b[] = {65,66,67,69};
		String str4 = new String(b);
		System.out.println(str4);
	}

}
