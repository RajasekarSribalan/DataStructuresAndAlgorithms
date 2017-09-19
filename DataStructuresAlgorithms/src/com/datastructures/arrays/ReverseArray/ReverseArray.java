package com.datastructures.arrays.ReverseArray;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int length = input.length;

		input = reverseArray(input, length);
		System.out.println(Arrays.toString(input));
	}

	private static int[] reverseArray(int[] input, int length) {

		int mid = length / 2;

		for (int i = 0; i < mid; i++) {
			int start = input[i];
			int end = input[length - 1 - i];
			input[i] = end;
			input[length - 1 - i] = start;
		}
		return input;
	}
}
