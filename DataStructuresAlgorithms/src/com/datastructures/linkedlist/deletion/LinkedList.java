package com.datastructures.linkedlist.deletion;

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

		deleteAtFront(linkedList, 5);

		System.out.println();
		System.out.println("Inserting a node at the front of the head");

		printLinkedList(linkedList.head);

		System.out.println();
		System.out.println("Inserting a node at the rear");

		deleteAtRear(linkedList, 12);

		printLinkedList(linkedList.head);

		System.out.println();
		System.out.println("Inserting a node at the rear");

		deleteAtRear(linkedList, 125);

		printLinkedList(linkedList.head);

		System.out.println();
		System.out.println("Inserting a node 10 after the node 2");

		deleteMiddle(linkedList, 2, 10);

		printLinkedList(linkedList.head);

		System.out.println();
		System.out.println("Inserting a node 100 after the node 125");

		deleteMiddle(linkedList, 125, 100);

		printLinkedList(linkedList.head);
	}

	private static void deleteMiddle(LinkedList linkedList, int node, int data) {
		Node newNode = new Node(data);
		Node head = linkedList.head;

		while (head != null) {

			if (head.data == node) {

				newNode.next = head.next;
				head.next = newNode;
			}
			head = head.next;
		}
	}

	private static void deleteAtRear(LinkedList linkedList, int data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data);
		Node head = linkedList.head;

		while (head.next != null) {
			head = head.next;
		}

		head.next = newNode;

	}

	private static void deleteAtFront(LinkedList linkedList, int data) {

		Node newNode = new Node(data);
		newNode.next = linkedList.head;
		linkedList.head = newNode;

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
