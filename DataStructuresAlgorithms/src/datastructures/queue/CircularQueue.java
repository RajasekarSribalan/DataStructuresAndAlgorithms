package datastructures.queue;

import java.util.Arrays;

/**
 * Circular queue implementation
 * 
 * For implementing queue, we need to keep track of two indices, front and rear.
 * We enqueue an item at the rear and dequeue an item from front. If we simply
 * increment front and rear indices, then there may be problems, front may reach
 * end of the array. The solution to this problem is to increase front and rear
 * in circular manner
 * 
 * @author raj
 *
 */
public class CircularQueue {

	private int front;
	private int rear;
	private int size;
	private int capacity;
	private int queue[];

	/**
	 * Constructor
	 * 
	 * @param capacity
	 */
	public CircularQueue(int capacity) {
		super();
		this.front = 0;
		this.rear = capacity - 1;
		this.size = 0;
		this.capacity = capacity;
		queue = new int[capacity];
	}

	boolean isQueueFull() {
		return this.size == this.capacity;
	}

	boolean isQueueEmpty() {
		return this.size == 0;
	}

	public void enqueue(int data) {

		if (isQueueFull()) {
			System.out.println("Queue is full");
			return;
		}

		this.rear = (this.rear + 1) % this.capacity;
		this.queue[this.rear] = data;
		this.size++;
		System.out.println("Inserted in queue");
	}

	public void dequeue() {
		if (isQueueEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		this.queue[this.front] = 0;
		this.front = (this.front + 1) % capacity;
		this.size--;
		System.out.println("deleted from queue");
	}

	public void display() {

		System.out.println(Arrays.toString(queue));
	}

	public static void main(String[] args) {
		CircularQueue queue = new CircularQueue(10);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.display();
		queue.dequeue();
		queue.display();
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.display();
		queue.dequeue();
		queue.display();
		queue.enqueue(7);
		queue.enqueue(8);
		queue.enqueue(9);
		queue.enqueue(10);
		queue.display();
		queue.enqueue(11);
		queue.enqueue(12);
		queue.display();
		queue.enqueue(13);
		queue.display();

	}
}
