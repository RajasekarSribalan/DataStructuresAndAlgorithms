package algorithms.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Stack Using Queues.
 * 
 * This algorithm uses two queues to handle the data.
 * 
 * First you push a data in a queue which is empty,say actual_queue.
 * Second,if you push another data,remove the existing data from actual_queue and move it to a temp queue.
 * Now insert the data in actual_queue and move all the data from temp queue to actual queue.
 * 
 * While removing,last inserted data will be poped automatically
 * 
 * @author Rajasekar
 *
 */
public class StackUsingQueues {

	private Queue<Integer> actual_queue;
	private Queue<Integer> temp;

	public StackUsingQueues() {
		this.actual_queue = new LinkedList<Integer>();
		this.temp = new LinkedList<Integer>();
	}

	public void enqueue(int data) {

		if (actual_queue.size() == 0) {
			actual_queue.add(data);
		} else {
			int si = actual_queue.size();
			for (int i = 0; i < si; i++) {
				temp.add(actual_queue.remove());
			}
			actual_queue.add(data);

			for (int i = 0; i < si; i++) {
				actual_queue.add(temp.remove());
			}

		}

	}

	public void dequeue() {
		System.out.println("Popped  : " + actual_queue.remove());

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackUsingQueues stack = new StackUsingQueues();

		stack.enqueue(1);
		stack.enqueue(2);
		stack.enqueue(3);
		stack.enqueue(4);
		
		
		stack.dequeue();
		stack.dequeue();
		stack.dequeue();
		stack.dequeue();
	}

}
