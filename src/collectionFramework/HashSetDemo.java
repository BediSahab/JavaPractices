package collectionFramework;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.remove(10);
		hs.add(10);
		
		
		System.out.println(hs);

	}

}
