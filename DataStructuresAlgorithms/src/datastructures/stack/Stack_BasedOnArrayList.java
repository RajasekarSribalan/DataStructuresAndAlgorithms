package datastructures.stack;

import java.util.ArrayList;
import java.util.List;
/**
 * Stack_BasedOnArrayList
 * @author Raj
 * Date : 21-Jan-15
 *
 */
public class Stack_BasedOnArrayList {

	private List<Integer> Stack = new ArrayList<Integer>();

	//Push
	public void push(int data) {
		
		Stack.add(data);
	}

	//Pop
	public int pop() {
		int temp = Stack.get(Stack.size() - 1);
		Stack.remove(Stack.size() - 1);
		return temp;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Stack_BasedOnArrayList stack = new Stack_BasedOnArrayList();
		stack.push(2);
		stack.push(4);
		stack.push(6);
		stack.push(8);
		System.out.println("******  After push   ************");
		for (int i = 0; i < stack.Stack.size(); i++) {
			System.out.println(stack.Stack.get(i));
		}
		System.out.println("poped....." + stack.pop());
		System.out.println("poped....." + stack.pop());
		System.out.println("******  After pop   ************");
		for (int i = 0; i < stack.Stack.size(); i++) {
			System.out.println(stack.Stack.get(i));
		}
	}

}
