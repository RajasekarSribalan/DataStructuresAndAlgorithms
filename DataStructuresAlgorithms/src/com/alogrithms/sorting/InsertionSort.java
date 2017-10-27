package com.alogrithms.sorting;

import java.util.Arrays;

public class InsertionSort {

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 5, 4, 3, 2, 1 };
		printArray("Before sorting", arr);
		arr = insertionSort(arr);
		printArray("After sorting", arr);
	}

	/**
	 * Method insertionSort to perform insertion sort on array
	 * 
	 * @param arr
	 * @return
	 */
	static int[] insertionSort(int arr[]) {

		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		return arr;

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
