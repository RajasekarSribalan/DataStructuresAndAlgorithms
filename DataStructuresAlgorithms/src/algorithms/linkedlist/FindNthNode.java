package algorithms.linkedlist;

public class FindNthNode {

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
		System.out.println();
	}

	public static void main(String[] args) {
		FindNthNode obj = new FindNthNode();
		obj.push(1);
		obj.push(2);
		obj.push(10);
		obj.push(11);
		obj.push(17);
		obj.push(4);
		obj.printLinkedList(obj.head);

		int N = 4;
		int data = findNthNodeIteratively(obj.head, N);
		System.out.println("(Iteratively) The data at " + N + "th node is " + data);
		int data2 = findNthNodeRecursively(obj.head, N);
		System.out.println("(Recursion) The data at " + N + "th node is " + data2);

	}

	/**
	 * Find the Nth node in linked list using recursive
	 * 
	 * @param head
	 * @param N
	 * @return
	 */
	private static int findNthNodeRecursively(Node head, int N) {

		int count = 1;

		if (count == N) {
			return head.data;
		} else {
			if (null != head) {
				return findNthNodeRecursively(head.next, N - 1);
			} else {
				return 0;
			}

		}

	}

	/**
	 * Find the Nth node in linked list using iterative
	 * 
	 * @param head
	 * @param N
	 * @return
	 */
	private static int findNthNodeIteratively(Node head, int N) {
		int count = 1;

		while (head != null) {
			if (count == N) {
				return head.data;
			}
			count++;
			head = head.next;
		}
		System.out.println("Node data found at " + N + "th node.Hence returning 0");
		return 0;
	}

}
