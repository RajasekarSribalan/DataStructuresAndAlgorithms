package algorithms.stack;

/**
 * Given a stack of integers, sort it in ascending order using another temporary stack.

Examples:

Input : [34, 3, 31, 98, 92, 23]
Output : [3, 23, 31, 34, 92, 98]

Input : [3, 5, 1, 4, 2, 8]
Output : [1, 2, 3, 4, 5, 8]


 */
import datastructures.stack.Stack_Integer;

public class SortUsingTempStack {

	public static void main(String[] args) throws Exception {
		// Create a stack
		Stack_Integer stack = new Stack_Integer(10);

		// Push random data
		stack.push(1);
		stack.push(0);
		stack.push(3);
		stack.push(6);
		stack.push(2);
		stack.push(7);
		stack.push(9);

		// Display before sort
		stack.display();

		Stack_Integer temp = sort(stack);

		// Display before sort
		temp.display();
	}

	/**
	 * Method sort
	 * 
	 * @param stack
	 * @return
	 * @throws Exception
	 */
	private static Stack_Integer sort(Stack_Integer stack) throws Exception {

		Stack_Integer temp = new Stack_Integer(10);

		while (!stack.isEmpty()) {
			int data = stack.pop();

			if (temp.isEmpty()) {
				temp.push(data);
			} else {
				while (!temp.isEmpty() && data < temp.top()) {
					stack.push(temp.pop());
				}
				temp.push(data);
			}
		}

		return temp;
	}
}
