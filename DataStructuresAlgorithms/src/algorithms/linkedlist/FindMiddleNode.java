package algorithms.linkedlist;

public class FindMiddleNode {

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
		FindMiddleNode obj = new FindMiddleNode();
		obj.push(1);
		obj.push(2);
		obj.push(10);
		obj.push(11);
		obj.push(17);
		obj.push(4);
		obj.push(12);
		obj.printLinkedList(obj.head);

		// First method using length and length/2
		int data = findTheMiddleNode(obj.head);
		System.out.println("(Iteratively) The data at middle node is " + data);

		//Second method using two pointers

		int data2 = findMiddleNodeUsingTwoPointers(obj.head);
		System.out.println("(Two pointer algo) The data at middle node is " + data2);

	}

	/**
	 * Method using two pointers.
	 * 
	 * First pointer will move two index always
	 * SLow pointer moves one by one
	 * 
	 * @param head
	 * @return
	 */
	private static int findMiddleNodeUsingTwoPointers(Node head) {

		Node firstPointer = head;
		Node slowPointer = head;

		if (null != head) {
			
			while(firstPointer != null && firstPointer.next !=null) {
					firstPointer = firstPointer.next.next;
					slowPointer = slowPointer.next;
			}
			return slowPointer.data;
			
		}
		return 0;
	}

	/**
	 * Find the middle node of the linked list
	 * 
	 * @param head
	 * @param N
	 * @return
	 */
	private static int findTheMiddleNode(Node head) {

		int length = getLength(head);
		
		int middleIndex = length/2;
		
		int count = 0;

		while (head != null) {
			if (count == middleIndex) {
				return head.data;
			}
			count++;
			head = head.next;
		}
		System.out.println("Node data found at middle node.Hence returning 0");
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
