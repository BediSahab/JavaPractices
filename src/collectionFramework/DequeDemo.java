package collectionFramework;

import java.util.ArrayDeque;

public class DequeDemo {

	public static void main(String[] args) {

		ArrayDeque<Integer> dq = new ArrayDeque<>();
		
		dq.offer(24);
		dq.offerLast(14);
		dq.offerLast(433);
		dq.offerLast(43332);
		dq.offer(56);
		dq.offerFirst(46);
		dq.offerFirst(3);
		dq.offer(4);
		
		dq.forEach(n->System.out.println(n));
		

	}

}
