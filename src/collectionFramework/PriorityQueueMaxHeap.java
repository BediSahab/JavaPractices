package collectionFramework;

import java.util.PriorityQueue;

public class PriorityQueueMaxHeap {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new MyCompPQ());

		pq.add(20);
		pq.add(10);
		pq.add(30);
		pq.add(5);
		pq.add(15);
		pq.add(3);
		
		System.out.println(pq.peek());

	}

}
