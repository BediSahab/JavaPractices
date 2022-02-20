package collectionFramework;

import java.util.BitSet;

public class BitSetDemo {

	public static void main(String[] args) {
		BitSet b = new BitSet();
		b.set(0);
		b.set(2);
		b.set(4);
		b.set(6);
		b.set(8);
		
		BitSet bs = new BitSet();
		//setting all bit as 1
		for(int i=0;i<9;i++)
		{
			bs.set(i);
		}
		b.and(bs);
		System.out.println(b);

	}

}
