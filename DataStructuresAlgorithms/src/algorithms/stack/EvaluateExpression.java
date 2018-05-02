package algorithms.stack;

import datastructures.stack.Stack_String;

public class EvaluateExpression {

	public static void main(String[] args) throws Exception {

		String expression = "3+5*2/1-1*3";

		evaluateExpression(expression);
	}

	private static void evaluateExpression(String expression) throws Exception {

		// Iterate over the expression and store operators in a stack and operands in
		// other stack

		Stack_String operands = new Stack_String(expression.length());
		Stack_String operator = new Stack_String(expression.length());

		// Load the data
		String lastOperator = "";
		for (int i = 0; i < expression.length(); i++) {

			String data = String.valueOf(expression.charAt(i));

			if (data.equalsIgnoreCase("+")) {
				operator.push(data);
				lastOperator = "";
			} else if (data.equalsIgnoreCase("-")) {
				operator.push(data);
				lastOperator = "";
			} else if (data.equalsIgnoreCase("*")) {
				operator.push(data);
				lastOperator = data;
			} else if (data.equalsIgnoreCase("/")) {
				operator.push(data);
				lastOperator = data;
			} else {
				if (lastOperator.equalsIgnoreCase("*")) {
					operator.pop();
					String out = operands.pop();
					int output = Integer.valueOf(out) * Integer.valueOf(data);
					operands.push(String.valueOf(output));
				} else if (lastOperator.equalsIgnoreCase("/")) {
					operator.pop();
					String out = operands.pop();
					int output = Integer.valueOf(out) / Integer.valueOf(data);
					operands.push(String.valueOf(output));
				} else {
					operands.push(data);
				}

			}
		}

		/*// display
		operands.display();
		operator.display();*/

		while (!operator.isEmpty()) {
			String opp = operator.pop();
			String input1 = operands.pop();
			String input2 = operands.pop();

			if (opp.equalsIgnoreCase("+")) {
				operands.push(String.valueOf(Integer.valueOf(input2) + Integer.valueOf(input1)));
			} else {
				operands.push(String.valueOf(Integer.valueOf(input2) - Integer.valueOf(input1)));
			}

		}

		/*// display
		operands.display();
		operator.display();*/
		
		
		System.out.println("Final answer : "+operands.pop());
	}

}
