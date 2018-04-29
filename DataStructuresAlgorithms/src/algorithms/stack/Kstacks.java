package algorithms.stack;

import java.util.Arrays;

/**
 * Create a data structure kStacks that represents k stacks. Implementation of
 * kStacks should use only one array, i.e., k stacks should use the same array
 * for storing elements. Following functions must be supported by kStacks.
 * 
 * push(int x, int sn) –> pushes x to stack number ‘sn’ where sn is from 0 to
 * k-1 pop(int sn) –> pops an element from stack number ‘sn’ where sn is from 0
 * to k-1
 * 
 * @author raj
 *
 */

public class Kstacks {

	private int[] stack;
	private int size;
	private int[] top;
	private static int[] rear;
	private static int[] head;
	private int noOfSlots;

	public Kstacks(int size, int noOfSlots) {
		super();
		this.stack = new int[size];
		this.size = size;
		this.noOfSlots = noOfSlots;
		this.top = new int[noOfSlots];
		this.rear = new int[noOfSlots];
		this.head = new int[noOfSlots];

		
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

			head[i] = top[i];
		}

		display();
	}

	void push(int data, int slotNumber) {

		if (top[slotNumber] == rear[slotNumber]) {
			System.out.println("Stack of Slot number " + slotNumber + " is full.Hence cannot insert");
			return;
		}
		stack[++top[slotNumber]] = data;
		display();
	}

	void pop(int data, int slotNumber) {
		if (top[slotNumber] == head[slotNumber]) {
			System.out.println("Stack of Slot number " + slotNumber + " is empty already.Hence cannot pop");
			return;
		}

		stack[top[slotNumber]--] = data;
		display();
	}

	private void display() {
		System.out.println("Stack array : " + Arrays.toString(stack));
		System.out.println("size : " + size);
		System.out.println("top index array : " + Arrays.toString(top));
		System.out.println("rear index array" + Arrays.toString(rear));
		System.out.println("head index array" + Arrays.toString(head));

	}

	public static void main(String[] args) {
		Kstacks kstacks = new Kstacks(10, 3);
		kstacks.push(1, 0);
		kstacks.push(2, 0);
		kstacks.push(3, 0);
		kstacks.push(4, 1);
		kstacks.push(5, 1);
		kstacks.push(6, 1);
		kstacks.push(7, 2);
		kstacks.push(8, 2);
		kstacks.push(9, 2);
		kstacks.push(10, 2);
		kstacks.push(9, 1);
		kstacks.push(9, 0);
		
		kstacks.pop(0, 0);
		kstacks.pop(0, 0);
		kstacks.pop(0, 0);
		kstacks.pop(0, 0);
	}

}
