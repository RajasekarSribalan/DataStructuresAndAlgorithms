package algorithms.linkedlist;

public class DeleteLinkedList {

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

	void deleteLinkedList() {
		this.head = null;
	}

	void push(int data) {

		System.out.println("Push " + data + " in the linked list");
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	private void printLinkedList(Node head) {

		if (head == null) {
			System.out.println("Linked list is empty");
		}
		while (head != null) {
			System.out.print(head.data);
			head = head.next;

			if (null != head) {
				System.out.print("-->");
			}
		}
	}

	public static void main(String[] args) {
		DeleteLinkedList obj = new DeleteLinkedList();
		obj.push(1);
		obj.push(2);
		obj.push(10);
		obj.push(11);
		obj.push(17);
		obj.push(4);

		obj.printLinkedList(obj.head);

		//Delete Linked list
		obj.deleteLinkedList();

		obj.printLinkedList(obj.head);

	}

}
