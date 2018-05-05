package algorithms.stack;

import java.util.Arrays;

import datastructures.stack.Stack_Integer;

/**
 * Given an array, print the Next Greater Element (NGE) for every element. The
 * Next greater Element for an element x is the first greater element on the
 * right side of x in array. Elements for which no greater element exist,
 * consider next greater element as -1.
 * 
 * Examples: a) For any array, rightmost element always has next greater element
 * as -1. b) For an array which is sorted in decreasing order, all elements have
 * next greater element as -1. c) For the input array [4, 5, 2, 25}, the next
 * greater elements for each element are as follows.
 * 
 * Element NGE 
 * 4 --> 5 
 * 5 --> 25 
 * 2 --> 25 
 * 25 --> -1 
 * 
 * d) For the input array 
 * [13,7, 6, 12}, the next greater elements for each element are as follows.
 * 
 * Element NGE 
 * 13 --> -1 
 * 7 --> 12 
 * 6 --> 12 
 * 12 --> -1
 * 
 * @author raj
 *
 */
public class NextGreaterElement {

	/**
	 * Main
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		
		/**
		 * Using two stacks
		 */
		int[] inputArray = { 4, 5, 2, 25 };
		Stack_Integer outputArray = nextGreaterElement(inputArray);
		System.out.println("Using two stacks - Input Array : "+Arrays.toString(inputArray));
		outputArray.display();
		
		int[] inputArray1 = { 12, 6, 7, 13 };
		outputArray = nextGreaterElement(inputArray1);
		System.out.println("Using two stacks - Input Array : "+Arrays.toString(inputArray1));
		outputArray.display();
		
		System.out.println("*********************************** \n");
		/**
		 * Using single stack
		 */
		
		int[] inputArray2 = { 4, 5, 2, 25 };
		System.out.println("Using single stack - Input Array : "+Arrays.toString(inputArray2));
		outputArray = nextGreaterElementUsingSingleStack(inputArray2);
		
		int[] inputArray3 = { 12, 6, 7, 13 };
		System.out.println("Using single stack - Input Array : "+Arrays.toString(inputArray3));
		outputArray = nextGreaterElementUsingSingleStack(inputArray3);
	}

	/**
	 * Method nextGreaterElement
	 * 
	 * This method uses two stacks
	 * @param inputArray
	 * @return
	 * @throws Exception
	 */
	private static Stack_Integer nextGreaterElement(int[] inputArray) throws Exception {

		Stack_Integer elementStack = new Stack_Integer(inputArray.length);
		Stack_Integer nextGreaterElementStack = new Stack_Integer(inputArray.length);
		for (int i = 0; i < inputArray.length; i++) {

			int data = inputArray[i];
			if (elementStack.isEmpty()) {
				elementStack.push(data);
				nextGreaterElementStack.push(-1);
			} else {
				if (elementStack.peek() > data && nextGreaterElementStack.peek() == -1) {
					nextGreaterElementStack.push(elementStack.peek());
				} else if (elementStack.peek() > data && nextGreaterElementStack.peek() > data) {
					nextGreaterElementStack.push(elementStack.peek());
				} else if (nextGreaterElementStack.peek() > data) {
					nextGreaterElementStack.push(nextGreaterElementStack.peek());
				}else{
					nextGreaterElementStack.push(-1);
				}
				elementStack.push(data);
			}

		}
		return nextGreaterElementStack;
	}

	
	/**
	 * Method nextGreaterElementUsingSingleStack
	 * 
	 * This method uses one stack
	 * @param inputArray
	 * @return
	 * @throws Exception
	 */
	private static Stack_Integer nextGreaterElementUsingSingleStack(int[] inputArray) throws Exception {

		Stack_Integer elementStack = new Stack_Integer(inputArray.length);
		Stack_Integer nextGreaterElementStack = new Stack_Integer(inputArray.length);
		int next = -1;
		for (int i = 0; i < inputArray.length; i++) {

			int data = inputArray[i];
			if (elementStack.isEmpty()) {
				elementStack.push(data);
				System.out.println(data + "--> " + next);
			} else {
				if (elementStack.peek() > data && next == -1) {
					next = elementStack.peek();
				} else if (elementStack.peek() > data && next > data) {
					next = elementStack.peek();
				} else if (next > data) {
					// do nothing because next will be same
				} else {
					next = -1;
				}
				elementStack.push(data);
				System.out.println(data + "--> " + next);
			}

		}
		return nextGreaterElementStack;
	}

}
