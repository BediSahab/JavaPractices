package collectionFramework;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<>();
		
		ht.put(1, "A");
		ht.put(2, "B");
		ht.put(3, "C");
		ht.put(4, "D");
		ht.put(5, "E");
		ht.put(6, "F");
		ht.put(7, "G");
		
		String s = ht.get(3);
		System.out.println(s);
		
		Enumeration<Integer> e = ht.keys();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		

	}

}
