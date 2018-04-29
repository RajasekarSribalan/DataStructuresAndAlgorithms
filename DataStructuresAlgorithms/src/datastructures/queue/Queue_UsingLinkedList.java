package datastructures.queue;
/**
 * Class Queue_UsingLinkedList
 * 
 * Queue : First in First out using LinkedList
 * 
 * @author raj
 *
 */
public class Queue_UsingLinkedList {

	public Node first, rear;
	private int size;

	public Queue_UsingLinkedList() {
		first = null;
		rear = null;
		size = 0;
	}

	public class Node {
		public Node next;
		public int data;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void enqueue(int data) {

		Node oldRear = rear;
		rear = new Node();
		rear.data = data;
		rear.next = null;
		if (isEmpty()) {
			first = rear;
		} else {
			oldRear.next = rear;
		}
		size++;
	}

	public int dequeue() {

		int temp = first.data;
		first = first.next;
		size--;
		return temp;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void display() {
		Node check = first;
		while (null != check) {
			System.out.print(check.data + "-->");
			check = check.next;
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue_UsingLinkedList queue = new Queue_UsingLinkedList();
		queue.enqueue(2);
		queue.enqueue(4);
		queue.enqueue(6);
		
		queue.display();

		System.out.println("Gonnaa remove");

		queue.dequeue();
		queue.dequeue();
		
		queue.display();
	}

	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}

	public Node getRear() {
		return rear;
	}

	public void setRear(Node rear) {
		this.rear = rear;
	}

}
