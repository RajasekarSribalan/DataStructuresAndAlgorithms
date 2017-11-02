package com.datastructures.array;

import java.util.Arrays;

public class ArrayApp {

	public static void main(String[] args) {

		// creating an int array with initial size as 100
		int[] array = new int[100];

		// inserting 10 data in the array
		insertData(10, array);

		// search a number in the array
		searchData(5, array);
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

	private static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));

	}
}
