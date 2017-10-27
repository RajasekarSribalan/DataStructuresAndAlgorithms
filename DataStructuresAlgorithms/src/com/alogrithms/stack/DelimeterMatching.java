package com.alogrithms.stack;

import com.datastructures.stack.Stack_Char;

/**
 * Class DelimeterMatching
 * 
 * 
 * This Alogrithm uses Stack - push & pop operation, internally to identify if the parenthesis are valid.
 * 
 * @author Rajasekar
 *
 */
public class DelimeterMatching {

	public String input;

	public DelimeterMatching(String in) {
		this.input = in;
	}

	//TO check if given string is matching
	public boolean check() throws Exception {
		int size = input.length();
		Stack_Char stack = new Stack_Char(size);
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			switch (ch) {
			case '{':
			case '(':
			case '[':
				stack.push(ch);
				break;
			case ')':
			case '}':
			case ']':
				if (stack.isEmpty()) {
					System.out.println("Error !!....");
					return false;
				}
				char poped = stack.pop();
				if ((poped == '{' && ch == '}') || (poped == '[' && ch == ']')
						|| (poped == '(' && ch == ')')) {
					System.out.println("poped succesfuly..");
				} else {
					System.out
							.println("error in matching...Error at matching.."
									+ poped + " & " + ch);
					return false;
				}
				break;

			default:
				break;
			}

		}
		return false;

	}

	public static void main(String[] args) {
		try {
			DelimeterMatching delimeterMatching = new DelimeterMatching(
					"{[()]}");

			delimeterMatching.check();
			System.out.println("Matched...");
			delimeterMatching = new DelimeterMatching("{[({[()]})]}");

			delimeterMatching.check();
			System.out.println("Matched...");
			delimeterMatching = new DelimeterMatching(")]}");

			delimeterMatching.check();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
