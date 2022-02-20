package collectionFramework;

import java.util.TreeSet;

public class TreeSetPCIDemo {
	public static void main(String[] args) {

		TreeSet<PointComparableInterfaceDemo> ts = new TreeSet<>();
		
		ts.add(new PointComparableInterfaceDemo(1,1));
		ts.add(new PointComparableInterfaceDemo(5,1));
		ts.add(new PointComparableInterfaceDemo(3,5));
		ts.add(new PointComparableInterfaceDemo(2,1));
		
		System.out.println(ts);

	}
}
