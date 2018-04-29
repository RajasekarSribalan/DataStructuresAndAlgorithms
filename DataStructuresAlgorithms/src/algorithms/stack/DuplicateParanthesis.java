package algorithms.stack;

import java.util.Stack;

public class DuplicateParanthesis {

	private String input;

	public DuplicateParanthesis(String in) {
		this.input = in;
	}

	public void removeDuplicateParanthesis() throws Exception {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (c == '(' || c == '+' || c == '*' || c == '-' || (c >= '0' && c <= '9')) {
				stack.push(c);
			} else if (c == ')') {
				if (stack.peek() == '+' || stack.peek() == '*' || stack.peek() == '-' || (stack.peek() >= '0'
						&& stack.peek() <= '9')) {
					while (stack.peek() != '(') {
						stack.pop();
					}
				} else {

					System.out.println("Duplicate found....");
					return;
				}
				stack.pop();
			}
		}
		System.out.println("No Duplicates........");

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DuplicateParanthesis duplicateParanthesis = new DuplicateParanthesis("((2))");
		try {
			duplicateParanthesis.removeDuplicateParanthesis();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
