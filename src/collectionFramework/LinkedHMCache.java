package collectionFramework;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHMCache {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(6) {
			
			protected boolean removeEldestEntry(Map.Entry e)
			{
				return size()>6;
				
			}
		};

		lhm.put(1, "A");
		lhm.put(2, "B");
		lhm.put(3, "C");
		lhm.put(4, "D");
		lhm.put(5, "E");
		lhm.put(6, "F");
		lhm.put(7, "G");
		
		System.out.println(lhm);

	}

}
