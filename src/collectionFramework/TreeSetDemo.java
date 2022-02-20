package collectionFramework;

import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<>(List.of(10,20,30,40,70,10,23));
		
		System.out.println(ts);

	}

}
