package algorithms.queue;

import java.util.Arrays;

public class KQueues {

	int[] queue;
	int size;
	int noOfSlots;
	int[] top;
	int[] rear;
	int[] tail;

	public KQueues(int size, int noOfSlots) {
		super();
		this.size = size;
		this.noOfSlots = noOfSlots;
		queue = new int[size];
		top = new int[noOfSlots];
		rear = new int[noOfSlots];
		tail = new int[noOfSlots];

		// Initializing top index to maintain top value
		int j = 0;
		for (int i = 0; i < this.top.length; i++) {

			for (int k = j; k < this.size;) {
				this.top[i] = j - 1;
				break;
			}
			j = j + noOfSlots;
		}

		// Initializing rear index

		int a = noOfSlots;
		for (int i = 0; i < this.rear.length; i++) {

			for (int k = a; k < this.size;) {
				this.rear[i] = a - 1;
				break;
			}
			a = a + noOfSlots;
		}

		// Initializing head
		for (int i = 0; i < this.top.length; i++) {

			tail[i] = top[i];
		}
	}

	void enqueue(int data, int slotNumber) {

		if (tail[slotNumber] == rear[slotNumber]) {
			System.out.println("Queue of Slot number " + slotNumber + " is full.Hence cannot insert");
			return;
		}
		queue[++tail[slotNumber]] = data;
		display();
	}

	void dequeue(int data, int slotNumber) {
		if (top[slotNumber] == rear[slotNumber]) {
			System.out.println("Queue of Slot number " + slotNumber + " is empty already.Hence cannot dequeue");
			return;
		}

		queue[++top[slotNumber]] = data;
		display();
	}

	private void display() {
		System.out.println("Queue array : " + Arrays.toString(queue));
		System.out.println("size : " + size);
		System.out.println("top index array : " + Arrays.toString(top));
		System.out.println("rear index array" + Arrays.toString(rear));
		System.out.println("tail index array" + Arrays.toString(tail));

	}
	
	public static void main(String[] args) {
		KQueues kqueue = new KQueues(10, 3);
		kqueue.enqueue(1, 0);
		kqueue.enqueue(2, 0);
		kqueue.enqueue(3, 0);
		kqueue.enqueue(4, 1);
		kqueue.enqueue(5, 1);
		kqueue.enqueue(6, 1);
		kqueue.enqueue(7, 2);
		kqueue.enqueue(8, 2);
		kqueue.enqueue(9, 2);
		kqueue.enqueue(10, 2);
		kqueue.enqueue(9, 1);
		kqueue.enqueue(9, 0);
		
		kqueue.dequeue(0, 0);
		kqueue.dequeue(0, 0);
		kqueue.dequeue(0, 0);
		kqueue.dequeue(0, 0);
		kqueue.dequeue(0, 1);
		kqueue.dequeue(0, 2);
	}
}
