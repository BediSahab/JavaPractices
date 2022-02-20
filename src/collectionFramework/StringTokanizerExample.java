package collectionFramework;

import java.util.StringTokenizer;

public class StringTokanizerExample {

	public static void main(String[] args) {

		String data = "name=ravi;address=delhi;country=india;dept=ECE";
		
		StringTokenizer st = new StringTokenizer(data,"=;"); //use (data,";");
		String s;
		
		while(st.hasMoreTokens())
		{
			s=st.nextToken();
			System.out.println(s);
		}

	}

}
