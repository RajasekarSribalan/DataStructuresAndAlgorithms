package com.alogrithms.sorting;

import java.util.Arrays;

public class InsertionSort {

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * ASCENDING ORDER
		 */

		int arr[] = { 5, 4, 3, 2, 1 };
		printArray("Before sorting", arr);
		arr = insertionSortASC(arr);
		printArray("After sorting in ascending order using insertion sort", arr);

		/*
		 * DESCENDING ORDER
		 */

		int arr1[] = { 1, 2, 3, 4, 5 };
		printArray("Before sorting", arr1);
		arr = insertionSortDESC(arr1);
		printArray("After sorting in descending order using insertion sort",
				arr1);
	}

	/**
	 * Method insertionSort to perform insertion sort ASCENDING on array
	 * 
	 * @param arr
	 * @return
	 */
	static int[] insertionSortASC(int arr[]) {

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
	 * Method insertionSort to perform insertion sort DESCENDING on array
	 * 
	 * @param arr
	 * @return
	 */
	static int[] insertionSortDESC(int arr[]) {

		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] < key) {
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
