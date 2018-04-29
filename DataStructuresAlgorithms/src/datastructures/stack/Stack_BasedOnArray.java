package datastructures.stack;

/**
 * Stack_BasedOnArray
 * @author Raj
 * Date : 21-Jan-15
 *
 */
public class Stack_BasedOnArray {

	public int[] Stack;
	public int top;

	//COnstructor
	public Stack_BasedOnArray(int size) throws Exception {

		if (size <= 0) {
			throw new Exception("size is less than Zero(0)");
		}
		this.Stack = new int[size];
		this.top = -1;
	}

	//Push Data
	public void push(int data) throws Exception {

		if (top == Stack.length) {
			throw new Exception("Stack is full");
		} else {
			top++;
			Stack[top] = data;
		}
	}

	//Pop Data
	public int pop() throws Exception {
		if (top == -1) {
			throw new Exception("Stack is Empty");
		}
		return Stack[top--];

	}

	//IsEmpty
	public boolean isEmpty() {
		return (top == -1);
	}

	//Peek
	public int peek() throws Exception {
		if (top == -1) {
			throw new Exception("Stack is Empty");
		}
		return Stack[top];
	}

	public static void main(String[] args) {

		try {
			Stack_BasedOnArray stack = new Stack_BasedOnArray(5);
			stack.push(1);
			stack.push(2);
			stack.push(3);
			stack.push(4);
			stack.push(5);
			for(int i= 0;i<=stack.top;i++){
				System.out.println(stack.Stack[i]);
			}
			stack.pop();
			stack.pop();
			for(int i= 0;i<=stack.top;i++){
				System.out.println(stack.Stack[i]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
