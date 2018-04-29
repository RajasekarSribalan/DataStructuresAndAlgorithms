package datastructures.queue;

/**
 * Class Queue_Integer
 * 
 * Queue : First in First out using Array
 * 
 * @author raj
 *
 */
public class Queue_Integer {

	public int[] queue;
	public int front;
	public int rear;
	public int size;

	public Queue_Integer(int size) {
		queue = new int[size];
		this.front = 0;
		this.rear = -1;
	}

	/**
	 * Method : enqueue
	 * @param data
	 */
	public void enqueue(int data) {
		rear++;
		queue[rear] = data;
		size++;
	}

	/**
	 * Method : dequeue
	 * @return
	 */
	public int dequeue() {
		size--;
		return queue[front++];

	}

	public int peelFront() {
		return queue[front];
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue_Integer queue = new Queue_Integer(10);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		
		while(!queue.isEmpty()){
			System.out.println(queue.dequeue());
		}

	}

}
