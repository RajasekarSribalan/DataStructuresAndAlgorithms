package com.datastructures.linkedlist;

public class LinkedList {

	Node head; // Head of the linked list

	/* Each node of the linked list */
	class Node {
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
}
