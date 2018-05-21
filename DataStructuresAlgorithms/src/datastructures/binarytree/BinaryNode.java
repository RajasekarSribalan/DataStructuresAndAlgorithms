package datastructures.binarytree;

/**
 * 
 * @author Raj
 * 
 *         Node to hold data and pointer to next node.
 *
 */
public class BinaryNode {
	public BinaryNode left, right;
	public int data;

	public BinaryNode() {

	}

	public BinaryNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BinaryNode getLeft() {
		return left;
	}

	public void setLeft(BinaryNode left) {
		this.left = left;
	}

	public BinaryNode getRight() {
		return right;
	}

	public void setRight(BinaryNode right) {
		this.right = right;
	}

}
