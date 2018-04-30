package algorithms.stack;

import datastructures.stack.Stack_Integer;

public class ReverseStackUsingRecursion {

	public static void main(String[] args) throws Exception {

		// Create a stack
		Stack_Integer stack = new Stack_Integer(10);

		// Push random data in stack
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}

		System.out.println("Original stack");
		stack.display();
		// reverse using recursion
		reverseUsingRecursion(stack);
		
		System.out.println("Reverse stack");
		stack.display();

	}

	
	/**
	 * Method reverseUsingRecursion
	 * 
	 * @param stack
	 * @throws Exception
	 */
	private static void reverseUsingRecursion(Stack_Integer stack) throws Exception {
		if (!stack.isEmpty()) {
			int data = stack.pop();
			reverseUsingRecursion(stack);
			insertAtBottom(data, stack);
		}

	}

	/**
	 * Method insertAtBottom
	 * 
	 * @param data
	 * @param stack
	 * @throws Exception
	 */
	private static void insertAtBottom(int data, Stack_Integer stack) throws Exception {
		if (stack.isEmpty()) {
			stack.push(data);
		} else {

			int x = stack.pop();
			insertAtBottom(data, stack);
			stack.push(x);
		}

	}

}
