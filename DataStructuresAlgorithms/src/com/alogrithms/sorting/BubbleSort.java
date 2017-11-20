package com.alogrithms.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = { 1, 4, 6, 11, 8, 5, 2, 19, 0 };

		/*
		 * ASCENDING ORDER
		 */

		bubbleSortAscending(array);
		printArray("Bubble sort in ascending order", array);

		/*
		 * DESCENDING ORDER
		 */

		bubbleSortDescending(array);
		printArray("Bubble sort in descending order", array);

	}

	/**
	 * @param array
	 */
	private static void bubbleSortAscending(int[] array) {
		int n = array.length;

		while (n > 0) {
			for (int i = 0; i < n - 1; i++) {

				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
			n--;
		}

	}

	/**
	 * @param array
	 */
	private static void bubbleSortDescending(int[] array) {
		int n = array.length;

		while (n > 0) {
			for (int i = 0; i < n - 1; i++) {

				if (array[i] < array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
			n--;
		}

	}

	/**
	 * Print Array
	 * 
	 * @param message
	 * @param arr
	 */
	private static void printArray(String message, int[] arr) {
		System.out.println(message + " : " + Arrays.toString(arr));

	}
}
