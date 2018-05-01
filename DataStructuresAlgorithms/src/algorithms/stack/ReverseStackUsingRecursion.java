package algorithms.stack;

import datastructures.stack.Stack_Integer;

/**
 * @author Rajasekar
 *
 */
public class ReverseStackUsingRecursion {
	public static void main(String[] args) throws Exception {
		
		//Create a stack
		Stack_Integer stack = new Stack_Integer(10);
		
		//Push random data
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}
		
		//Display before reverse
		stack.display();
		
		//ReverseStack
		reverseStack(stack);
		

		//Display after reverse
		stack.display();
		
	}

	/**
	 * Method reverseStack
	 * 
	 * @param stack
	 * @throws Exception
	 */
	private static void reverseStack(Stack_Integer stack) throws Exception {

		if(!stack.isEmpty()) {
			int data = stack.pop();
			reverseStack(stack);
			insertAtBottom(stack,data);
		}
	}

	/**
	 * Method insertAtBottom
	 * 
	 * @param stack
	 * @param data
	 * @throws Exception
	 */
	private static void insertAtBottom(Stack_Integer stack, int data) throws Exception {

		if(stack.isEmpty()) {
			stack.push(data);
		}else {
			
			int x = stack.pop();
			insertAtBottom(stack, data);
			stack.push(x);
		}
	}
}
