package collections.queue;
import java.util.PriorityQueue;
import java.util.Queue;


public class QueueDemo {
	
	public static void main(String[] args) {
		Queue q = new PriorityQueue();
		q.add("A");
		q.add("Z");
		q.add("m");
		
		
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
	}

}
