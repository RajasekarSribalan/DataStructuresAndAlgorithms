package algorithms.stack;

import datastructures.stack.Stack_Integer;

/**
 * @author Rajasekar
 *
 */
public class SortStackUsingRecursion {
	public static void main(String[] args) throws Exception {
		
		//Create a stack
		Stack_Integer stack = new Stack_Integer(10);
		
		//Push random data
		stack.push(1);
		stack.push(0);
		stack.push(3);
		stack.push(6);
		stack.push(2);
		stack.push(7);
		stack.push(9);
		
		
		//Display before sort
		stack.display();
		
		//sortStack
		sortStack(stack);
		

		//Display after sort
		stack.display();
		
	}

	/**
	 * Method sortStack
	 * 
	 * @param stack
	 * @throws Exception
	 */
	private static void sortStack(Stack_Integer stack) throws Exception {

		if(!stack.isEmpty()) {
			int data = stack.pop();
			sortStack(stack);
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

		if(stack.isEmpty() || data < stack.top()) {
			stack.push(data);
		}else {
			
			int x = stack.pop();
			insertAtBottom(stack, data);
			stack.push(x);
		}
	}
}
