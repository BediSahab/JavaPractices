package string;

public class StringChallengeThree {

	public static void main(String[] args) {
		String str = "a!B@c#1$2%3";
		
		String output = str.replaceAll("\\W","");
		String output2 = str.replaceAll("[^0-9A-Za-z]","");
		System.out.println(output);
		System.out.println(output2);

		String str2 = "  abc    def   ghi    jkl    ";
		
		str2=str2.replaceAll("\\s+", " ").trim();
		
		String[] words = str2.split("\\s"); // same as split(" ");
		System.out.println(words.length);
	}

}
