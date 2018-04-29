package datastructures.utils;

/**
 * 
 * @author Raj
 * 
 * Node to hold data and pointer to next node.
 *
 */
public class Node {
	public Node next;
	public int data;

	public Node(){
		
	}
	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
