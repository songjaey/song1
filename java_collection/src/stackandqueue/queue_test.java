package stackandqueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue_test {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		
		q.add("김민수");
		q.offer("노재홍");
		q.offer("서종우");
		q.offer("박종권");
		
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q.poll());
		// remove는 큐에서 꺼낼 값이 없는 경우 오류
		System.out.println(q.peek());
		System.out.println(q.isEmpty());
		
		Queue<String> pq = new PriorityQueue<String>();
		
		pq.offer("라디오");
		pq.offer("하마");
		pq.offer("나비");
		pq.offer("Boy");
		pq.offer("가방");
		
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
		Deque<Integer> dq = new ArrayDeque<>();
		
		dq.addFirst(10);
		dq.offerFirst(20);
		dq.addLast(5);
		dq.offerLast(11);
		System.out.println(dq);
		
		dq.push(111);
		System.out.println(dq);
	}

}
