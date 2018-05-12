package algorithms.queue;

import datastructures.stack.Stack_Integer;

/**
 * Queue Using Stacks.
 * 
 * This algorithm uses two stack to handle the data.
 * 
 * First you push a data in a stack which is empty,say stack. Second,if you push
 * another data,remove the existing data from stack and move it to a temp stack.
 * Now insert the data in stack and move all the data from temp stack to actual
 * stack.
 * 
 * While removing,last inserted data will be poped automatically
 * 
 * @author Rajasekar
 *
 */
public class QueueUsingStack {

	Stack_Integer tempStack;
	Stack_Integer stack;

	public QueueUsingStack(int size) throws Exception {
		super();
		this.tempStack = new Stack_Integer(size);
		this.stack = new Stack_Integer(size);
	}

	void push(int data) throws Exception {

		if (stack.isEmpty()) {
			stack.push(data);
		} else {
			while (!stack.isEmpty()) {
				tempStack.push(stack.pop());
			}

			stack.push(data);

			while (!tempStack.isEmpty()) {
				stack.push(tempStack.pop());
			}
		}

	}

	void pop() throws Exception {
		System.out.println("Popped  : " + stack.pop());
	}

	void display() {
		stack.display();
	}

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		QueueUsingStack stack = new QueueUsingStack(10);

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
	}

}
