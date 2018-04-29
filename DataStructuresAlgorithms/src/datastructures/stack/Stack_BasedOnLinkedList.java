package datastructures.stack;

import datastructures.utils.Node;

/**
 * Stack_BasedOnLinkedList
 * 
 * @author Raj Date : 21-Jan-15
 * 
 */
public class Stack_BasedOnLinkedList {

	private Node head;
	private int size;


	//Constructor
	public Stack_BasedOnLinkedList() {
		this.head = null;
		size = 0;
	}

	//Push
	public void push(int data) {

		Node newHead = new Node();
		newHead.data = data;
		newHead.next = head;
		head = newHead;
		size++;
	}

	//Pop
	public int pop() {
		int temp = head.data;
		this.head = head.next;
		size--;
		return temp;
	}

	//pop
	public int peek() {
		return head.data;
	}

	//isEmpty
	public boolean isEmpty() {
		return size == 0;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack_BasedOnLinkedList stack = new Stack_BasedOnLinkedList();
		stack.push(2);
		stack.push(4);
		stack.push(6);
		stack.push(8);
		System.out.println("******  After push   ************");
		System.out.print(stack.head.data+"--->");
		Node node = stack.head.next;
		for (int i = 2; i <= stack.size; i++) {
			
			System.out.print(node.data+"--->");
			node= node.next;
		}
		System.out.println("poped....." + stack.pop());
		System.out.println("poped....." + stack.pop());
		System.out.println("******  After pop   ************");
		System.out.print(stack.head.data+"--->");
		Node nodee = stack.head.next;
		for (int i = 2; i <= stack.size; i++) {
			
			System.out.print(nodee.data);
			nodee= nodee.next;
		}
		System.out.println("poped....." + stack.pop());
		System.out.println("poped....." + stack.pop());
		

	}

}
