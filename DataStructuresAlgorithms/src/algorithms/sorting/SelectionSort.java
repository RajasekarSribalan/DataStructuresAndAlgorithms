package algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] array = { 1, 4, 6, 11, 8, 5, 2, 19, 0 };

		/*
		 * ASCENDING ORDER
		 */

		selectionSortAscending(array);
		printArray("SelectionSort in ascending order", array);

		/*
		 * DESCENDING ORDER
		 */

		selectionSortDescending(array);
		printArray("SelectionSort in descending order", array);

	}

	private static void selectionSortAscending(int[] array) {
		int n = array.length;
		int j = 0;
		while (n > 0) {
			int temp = array[j];
			int min = temp;
			int minIndex = j;
			for (int i = j; i < array.length; i++) {
				if (array[i] < min) {
					min = array[i];
					minIndex = i;
				}
			}

			array[j] = min;
			array[minIndex] = temp;
			j++;
			n--;
		}

	}

	private static void selectionSortDescending(int[] array) {

		int n = array.length;
		int j = 0;
		while (n > 0) {
			int temp = array[j];
			int min = temp;
			int minIndex = j;
			for (int i = j; i < array.length; i++) {
				if (array[i] > min) {
					min = array[i];
					minIndex = i;
				}
			}

			array[j] = min;
			array[minIndex] = temp;
			j++;
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
