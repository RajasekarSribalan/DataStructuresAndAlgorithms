package com.datastructures.linkedlist;

public class LinkedList {

	Node head; // Head of the linked list

	/* Each node of the linked list */
	static class Node {
		int data;
		Node next;

		/*
		 * Constructor to initialize the node with the data and the reference to
		 * the next pointer
		 */
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	/**
	 * Create a Linked List with three nodes
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();

		// Head or first node
		linkedList.head = new Node(1);

		// Second Node
		Node secondNode = new Node(2);

		// Third Node
		Node thirdNode = new Node(3);

		// Attach the HEad node with second node
		linkedList.head.next = secondNode;

		// Attach the second Node with Third node.
		secondNode.next = thirdNode;

		printLinkedList(linkedList.head);
	}

	private static void printLinkedList(Node head) {

		while (head != null) {
			System.out.print(head.data);
			head = head.next;

			if (null != head) {
				System.out.print("-->");
			}
		}
	}
}
