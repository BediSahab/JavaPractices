package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer,String> tm = new HashMap<>(Map.of(0,"xyz",1,"abc",2,"def",3,"ghi"));

		System.out.println(tm.get(0));
		System.out.println(tm.containsKey(5));
		System.out.println(tm.containsValue("def"));
		System.out.println(tm.entrySet());
		System.out.println(tm);

	}

}
