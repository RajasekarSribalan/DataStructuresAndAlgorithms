package datastructures.binarytree;

/**
 * Class BinayTree
 * 
 * @author Rajasekar
 *
 */
public class BinayTree {

	BinaryNode root;

	/**
	 * Method inOrderTraversal
	 * 
	 * @param root
	 */
	void inOrderTraversal(BinaryNode root) {

		if (root == null) {
			return;
		}
		inOrderTraversal(root.getLeft());
		System.out.print(root.getData());
		inOrderTraversal(root.getRight());
	}

	/**
	 * Method preOrderTraversal
	 * 
	 * @param root
	 */
	void preOrderTraversal(BinaryNode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.getData());
		preOrderTraversal(root.getLeft());
		preOrderTraversal(root.getRight());
	}

	/**
	 * Method postOrderTraversal
	 * 
	 * @param root
	 */
	void postOrderTraversal(BinaryNode root) {
		if (root == null) {
			return;
		}
		postOrderTraversal(root.getLeft());
		postOrderTraversal(root.getRight());
		System.out.print(root.getData());
	}

	void inOrderTraversal() {
		inOrderTraversal(root);
	}

	void preOrderTraversal() {
		preOrderTraversal(root);
	}

	void postOrderTraversal() {
		postOrderTraversal(root);
	}

	public static void main(String[] args) {
		BinayTree tree = new BinayTree();
		tree.root = new BinaryNode(1);
		tree.root.left = new BinaryNode(2);
		tree.root.right = new BinaryNode(3);
		tree.root.left.left = new BinaryNode(4);
		tree.root.left.right = new BinaryNode(5);
		tree.root.right.left = new BinaryNode(6);
		tree.root.right.right = new BinaryNode(7);

		System.out.println("InOrder Traversal \n");
		tree.inOrderTraversal();
		System.out.println("\n");

		System.out.println("PreOrder Traversal \n");
		tree.preOrderTraversal();
		System.out.println("\n");

		System.out.println("PostOrder Traversal \n");
		tree.postOrderTraversal();
		System.out.println("\n");

	}
}
