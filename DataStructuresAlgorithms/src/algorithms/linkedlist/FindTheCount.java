package algorithms.linkedlist;

import algorithms.linkedlist.FindTheLength.Node;

public class FindTheCount {

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
	 * Find the count of given key in the linked list
	 * 
	 * @return
	 */
	int getCount(int key,Node head) {

		int count = 0;
		if(null == head) {
			return count;
		}else {
			while(null != head) {
				if(key == head.data) {
					count++;
				}
				head = head.next;
			}
			return count;
		}

	}
	
	/**
	 * Find the count of given key in the linked list using recursion
	 * 
	 * @return
	 */
	int getCountWithRecursion(int key,Node head) {
		if(null == head) {
			return 0;
		}
		if(head.data == key) {
			return 1 + getCountWithRecursion(key,head.next);
		}else {
			return 0 + getCountWithRecursion(key,head.next);
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
		FindTheCount obj = new FindTheCount();
		obj.push(1);
		obj.push(2);
		obj.push(10);
		obj.printLinkedList(obj.head);
		obj.push(11);
		obj.push(17);
		obj.push(4);
		obj.push(10);
		obj.printLinkedList(obj.head);
		System.out.println("(Iterative) Count the occurences of a node 1 is " + obj.getCount(1, obj.head));
		System.out.println("(Recursion) Count the occurences of a node 1 is " + obj.getCountWithRecursion(1, obj.head));
		System.out.println("(Iterative) Count the occurences of a node 10 is " + obj.getCount(10, obj.head));
		System.out.println("(Recursion) Count the occurences of a node 10 is " + obj.getCountWithRecursion(10, obj.head));
		System.out.println("(Iterative) Count the occurences of a node 13 is " + obj.getCount(13, obj.head));
		System.out.println("(Recursion) Count the occurences of a node 13 is " + obj.getCountWithRecursion(13, obj.head));
	}

}
