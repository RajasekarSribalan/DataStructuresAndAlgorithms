package algorithms.linkedlist;

public class SearchAnElement {

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
	 * Search iteratively
	 * 
	 * @return
	 */
	boolean searchIteratively(Node head, int data) {

		if (head.data == data) {
			return true;
		} else {
			while (head.next != null) {
				if (head.next.data == data) {
					return true;
				}
				head = head.next;
			}
			return false;
		}
	}

	boolean searchRecursively(Node head, int data) {

		if (head == null) {
			return false;
		}

		if (head.data == data) {
			return true;
		}
		return searchRecursively(head.next, data);

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
		SearchAnElement obj = new SearchAnElement();
		obj.push(1);
		obj.push(2);
		obj.push(10);
		obj.printLinkedList(obj.head);
		System.out.println("Search 10 (Iterative method ): " + obj.searchIteratively(obj.head, 10));
		System.out.println("Search 10 (Recursive method ): " + obj.searchRecursively(obj.head, 10));
		obj.push(11);
		obj.push(17);
		obj.push(4);
		obj.printLinkedList(obj.head);
		System.out.println("Search 17 (Iterative method ): " + obj.searchIteratively(obj.head, 17));
		System.out.println("Search 17 (Recursive method ): " + obj.searchRecursively(obj.head, 17));
		
		System.out.println("Search 5 (Iterative method ): " + obj.searchIteratively(obj.head, 5));
		System.out.println("Search 5 (Recursive method ): " + obj.searchRecursively(obj.head, 5));
	}

}
