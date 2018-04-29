package datastructures.stack;

/**
 * 
 * @author Raj
 * 
 * This is a stack based on Integer.
 * 
 * It has five operations - push,push,peek,top,is Empty
 * 
 * Complexity - O(1)
 *
 */
public class Stack_Integer {
	int[] stack;
	int top;

	public Stack_Integer(int size) throws Exception {

		if (size < 1) {
			throw new Exception("Size is less");
		}
		stack = new int[size];
		top = -1;
	}

	public void push(int data) throws Exception {

		if (top == stack.length) {
			throw new Exception("stack is full");
		}
		top++;
		stack[top] = data;
	}

	public int pop() throws Exception {

		if (top < 0) {
			throw new Exception("stack is empty");
		}
		return stack[top--];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public int top() {
		return stack[top];
	}
}
