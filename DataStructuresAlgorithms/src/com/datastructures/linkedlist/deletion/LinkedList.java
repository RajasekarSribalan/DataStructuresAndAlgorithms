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

		System.out.println();
		System.out.println("delete a node at the front of the head");
		
		deleteAtFront(linkedList);

		printLinkedList(linkedList.head);


		System.out.println();
		System.out.println("Inserting a node at the rear");


		deleteAtRear(linkedList);

		printLinkedList(linkedList.head);

		System.out.println();
		System.out.println("delete a node at the rear");

		deleteAtRear(linkedList);

		printLinkedList(linkedList.head);

		/*System.out.println();
		System.out.println("Inserting a node 10 after the node 2");

		deleteMiddle(linkedList, 2, 10);

		printLinkedList(linkedList.head);

		System.out.println();
		System.out.println("Inserting a node 100 after the node 125");

		deleteMiddle(linkedList, 125, 100);

		printLinkedList(linkedList.head);*/
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

	private static void deleteAtRear(LinkedList linkedList) {
		// TODO Auto-generated method stub
		Node head = linkedList.head;
		
		if(head.next == null){
			System.out.println("Only one node available.Hence not deleting");
		}

		while (head.next != null) {
			
			if(head.next.next == null){
				head.next = null;
			}else{
				head = head.next;
			}
			
		}


	}

	private static void deleteAtFront(LinkedList linkedList) {

		linkedList.head = linkedList.head.next;

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
