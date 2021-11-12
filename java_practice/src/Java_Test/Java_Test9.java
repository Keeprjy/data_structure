package Java_Test;

import java.util.LinkedList;
import java.util.Queue;

import JavaChallenge.Queue_9;

public class Java_Test9 {

	public static void main(String[] args) {
		Queue q = new LinkedList<>();
		Queue_9 queue = new Queue_9();
		queue.add(1);
		queue.add(2);
		q.add(1);
		q.add(2);
		queue.add(3);
		queue.add(4);
		q.add(3);
		q.add(4);
		
		System.out.println(q.poll());
		System.out.println(queue.poll());

	}

}
