package collectionFramework;

import java.util.HashMap;
import java.util.Scanner;

public class CountDuplicateString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str[] = s.nextLine().split("_");
		HashMap<String, Integer> map = new HashMap<>();
		
		
		for(String x:str)
		{
			if(map.containsKey(x))
				map.put(x, map.get(x)+1);	
			else
				map.put(x, 1);
		}
		System.out.println(map);
		s.close();
	}

}
