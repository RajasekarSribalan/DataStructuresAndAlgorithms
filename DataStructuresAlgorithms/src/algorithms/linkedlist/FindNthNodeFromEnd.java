package algorithms.linkedlist;

public class FindNthNodeFromEnd {

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
		FindNthNodeFromEnd obj = new FindNthNodeFromEnd();
		obj.push(1);
		obj.push(2);
		obj.push(10);
		obj.push(11);
		obj.push(17);
		obj.push(4);
		obj.printLinkedList(obj.head);

		int N = 5;
		
		// First method using formula l-n+1
		int data = findNthNodeFromEnd(obj.head, N);
		System.out.println("(Iteratively) The data at " + N + "th node is " + data);
		
		// Second method using two pointers
		
		int data2 = findNthNodeFromEndUsingTwoPointers(obj.head, N);

	}

	private static int findNthNodeFromEndUsingTwoPointers(Node head, int n) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Find the Nth node from the end of linked list using Iterative
	 * 
	 * @param head
	 * @param N
	 * @return
	 */
	private static int findNthNodeFromEnd(Node head, int N) {

		int length = getLength(head);
		
		int index = length -N + 1;
		
		if(index < 1) {
			System.out.println("Invalid node index");
			return 0;
		}
		
		int count = 1;

		while (head != null) {
			if (count == index) {
				return head.data;
			}
			count++;
			head = head.next;
		}
		System.out.println("Node data found at " + N + "th node.Hence returning 0");
		return 0;
	}

	private static int getLength(Node head) {

		int length = 0;
		while (head != null) {
			length++;
			head = head.next;
		}
		
		return length;
	}

}
