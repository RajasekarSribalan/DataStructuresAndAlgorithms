package com.datastructures.stack.algorithms;

import java.util.Arrays;

/**
 * This is the algorithm for Two stacks in Single array.
 * 
 * Basically we use the available space.The idea is to start two stacks from
 * extreme corner. Stack1 starts at the left most corner on index -1 and Stack2
 * starts at right most corner on index size.
 * 
 * We have two different operations for both stacks as below, push1,push2
 * pop1,pop2
 * 
 * @author Rajasekar
 * 
 */
public class TwoStacks_OneArray {

	public int[] stackArray;

	public int top, top2;

	public int size;

	public TwoStacks_OneArray(int sizet) {
		stackArray = new int[sizet];
		top = -1;
		top2 = sizet;
		size = sizet;
	}

	/**
	 * Method push1 for Stack1
	 * 
	 * @param data
	 */
	public void push1(int data) {

		if (top < top2 - 1) {
			top++;
			stackArray[top] = data;
		} else {
			System.out.println("Arrayy is full");
		}
	}

	/**
	 * Method push2 for Stack2
	 * 
	 * @param data
	 */
	public void push2(int data) {
		if (top < top2 - 1) {
			top2--;
			stackArray[top2] = data;
		} else {
			System.out.println("Arrayy is full");
		}
	}

	/**
	 * Method pop1 for Stack1
	 * 
	 * @param data
	 */
	public int pop1() {

		if (top >= 0) {
			int temp = stackArray[top];
			stackArray[top--] = 0;
			return temp;
		} else {
			System.out.println("stack1 is empty");
			return -1;
		}
	}

	/**
	 * Method pop2 for Stack2
	 * 
	 * @param data
	 */
	public int pop2() {

		if (top2 < size) {
			int temp = stackArray[top2];
			stackArray[top2++] = 0;
			return temp;
		} else {
			System.out.println("stack2 is empty");
			return -1;
		}
	}

	/**
	 * Test Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TwoStacks_OneArray stack = new TwoStacks_OneArray(10);
		stack.push1(1);
		stack.push2(2);
		stack.push2(5);
		stack.push2(7);
		stack.push2(3);

		System.out.println(Arrays.toString(stack.stackArray));

		stack.pop1();
		stack.pop2();
		stack.pop2();
		System.out.println(Arrays.toString(stack.stackArray));
	}

}
