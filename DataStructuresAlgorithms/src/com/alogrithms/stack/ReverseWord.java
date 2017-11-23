package com.alogrithms.stack;

import com.datastructures.stack.Stack_Char;

public class ReverseWord {
	public static void main(String[] args) throws Exception {

		String word = "Rajasekar";
		reverseWord(word);
	}

	private static void reverseWord(String word) throws Exception {

		System.out.println("Input String : " + word);
		int length = word.length();
		Stack_Char stack = new Stack_Char(length);

		for (int i = 0; i < length; i++) {
			char c = word.charAt(i);
			stack.push(c);
		}

		String reversedWord = "";
		while (!stack.isEmpty()) {
			reversedWord = reversedWord + stack.pop();
		}

		System.out.println("Reversed String : " + reversedWord);

	}
}
