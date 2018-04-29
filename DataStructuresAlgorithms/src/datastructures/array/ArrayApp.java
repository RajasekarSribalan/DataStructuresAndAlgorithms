package datastructures.array;

import java.util.Arrays;

public class ArrayApp {

	public static void main(String[] args) {

		// creating an int array with initial size as 100
		int[] array = new int[10];

		// inserting 10 data in the array
		insertData(10, array);

		// search a number in the array
		searchData(5, array);

		// delete a number in the array and shift the right side data
		deleteData(5, array);

		// delete a number in the array and shift the right side data
		deleteData(6, array);

		// printing array
		printArray(array);

		// Insert data 4 at index 3 and shift the array
		insertAtIndex(3, 14, array);

		// Insert data 41 at index 3 and shift the array
		insertAtIndex(3, 41, array);

	}

	private static void insertAtIndex(int index, int data, int[] array) {

		int temp = 0;
		for (int i = index; i < array.length; i++) {
			temp = array[i];
			array[i] = data;
			data = temp;
		}

		printArray(array);

	}

	/**
	 * search a data in an array - Linear search - UnOrdered array
	 * 
	 * @param data
	 * @param array
	 */
	private static void searchData(int data, int[] array) {

		boolean flag = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == data) {
				System.out.println("Data " + data + " found at index : " + i);
				flag = true;
				break;
			}
		}

		if (!flag) {
			System.out.println("Can't find the data : " + data);
		}

	}

	/**
	 * Insert data in array
	 */
	private static void insertData(int series, int[] array) {

		for (int i = 0; i < series; i++) {
			array[i] = i + 1;
		}

		printArray(array);

	}

	/**
	 * 
	 * @param data
	 * @param array
	 */
	private static void deleteData(int data, int[] array) {

		System.out.println("Deleting " + data + " from array");
		for (int i = 0; i < array.length; i++) {

			if (array[i] == data) {
				while (i < array.length - 1) {
					array[i] = array[i + 1];
					i++;
				}
				array[i] = 0;
				break;
			}

		}

		printArray(array);

	}

	private static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));

	}
}
