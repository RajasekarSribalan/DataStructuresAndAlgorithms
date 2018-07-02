package algorithms.linkedlist;

import algorithms.linkedlist.DeleteLinkedList.Node;

public class FindTheLength {

	Node head;

	static class Node {

		int data;
		Node next;

		/*
		 * Constructor to initialize the node with the data and the reference to the
		 * next pointer
		 */
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	/**
	 * Find the length of linked list using iterative method
	 * 
	 * @return
	 */
	int getLength() {

		Node temp = head;
		int count = 0;
		if (null == temp) {
			return count;
		} else {
			while (temp != null) {
				temp = temp.next;
				count++;
			}
			return count;
		}

	}

	/**
	 * Find the length of linked list using Recursive method
	 * 
	 * @param head
	 * @return
	 */
	int getCount(Node head) {
		if (head == null) {
			return 0;
		} else {
			return 1 + getCount(head.next);
		}
	}

	void push(int data) {

		System.out.println("Push " + data + " in the linked list");
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	private void printLinkedList(Node head) {

		Node temp = head;
		if (temp == null) {
			System.out.println("Linked list is empty");
		}
		while (temp != null) {
			System.out.print(temp.data);
			temp = temp.next;

			if (null != temp) {
				System.out.print("-->");
			}
		}
	}

	public static void main(String[] args) {
		FindTheLength obj = new FindTheLength();
		obj.push(1);
		obj.push(2);
		obj.push(10);
		obj.printLinkedList(obj.head);
		System.out.println("LengthOfLinkedList is (Iterative method ): " + obj.getLength());
		System.out.println("LengthOfLinkedList is (Recursive method ): " + obj.getCount(obj.head));
		obj.push(11);
		obj.push(17);
		obj.push(4);
		obj.printLinkedList(obj.head);
		System.out.println("LengthOfLinkedList is (Iterative method ): " + obj.getLength());
		System.out.println("LengthOfLinkedList is (Recursive method ): " + obj.getCount(obj.head));
	}

}
