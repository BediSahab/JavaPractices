package collectionFramework;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm = new TreeMap<>(Map.of(0,"xyz",1,"abc",2,"def",3,"ghi"));

		System.out.println(tm.get(0));
		System.out.println(tm.containsKey(5));
		System.out.println(tm.containsValue("def"));
		System.out.println(tm.entrySet());
		System.out.println(tm);
		
		//to Print firstEntry
		Entry<Integer,String> e = tm.firstEntry();
		System.out.println(e.getKey()+"="+e.getValue());
		
		//to iterate whole TreeMap
		Set ee = tm.entrySet();
		Iterator it = ee.iterator();
		
		while(it.hasNext())
		{
			Entry mp = (Entry) it.next();
			System.out.println(mp.getKey()+"="+mp.getValue());
			
		}
		
		
	}

}
