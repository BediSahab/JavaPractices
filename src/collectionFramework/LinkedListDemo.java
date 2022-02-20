package collectionFramework;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> a=new LinkedList<>();
        
        LinkedList<Integer> b=new LinkedList<>(List.of(50,60,70,80,90));
        
        a.add(10);
        a.add(0,5);
        //al1.addAll(al2);
        a.addAll(1,b);
        a.add(5,70);
        a.set(6,100);
        
        a.addFirst(3);
        a.addLast(45);
        
        
        
        a.forEach(n->System.out.println(n));

	}

}
