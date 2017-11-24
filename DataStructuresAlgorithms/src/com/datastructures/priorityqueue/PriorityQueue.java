package com.datastructures.priorityqueue;

public class PriorityQueue {

	private int[] array;
	private int size;
	private int noOfItems;

	public PriorityQueue(int size) {
		this.size = size;
		array = new int[size];
		noOfItems = 0;
	}

	private void insert(int data) {
		int j;
		if (noOfItems == 0) {
			array[noOfItems++] = data;
		} else {

			for (j = noOfItems - 1; j >= 0; j--) {

				if (data > array[j]) {
					array[j + 1] = array[j];
				} else {
					break;
				}

			}
			array[j + 1] = data;
			noOfItems++;

		}
	}

	public static void main(String[] args) {
		PriorityQueue priorityQueue = new PriorityQueue(10);
		priorityQueue.insert(1);
		priorityQueue.insert(3);
		priorityQueue.insert(10);
		priorityQueue.insert(2);
	}
}
