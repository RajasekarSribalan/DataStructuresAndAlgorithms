package com.alogrithms.stack;
public class FindMinimumInStack {

	private int[] actualStack;
	private int[] minStack;
	private int top;
	private int mintop;

	public FindMinimumInStack(int size) {
		actualStack = new int[size];
		minStack = new int[size];
		top = -1;
		mintop = -1;

	}

	public void push(int data) {
		if (isEmpty()) {
			top++;
			mintop++;
			actualStack[top] = data;
			minStack[mintop] = data;
		} else {
			top++;
			actualStack[top] = data;
			int min = minPeek();
			if (data < min) {
				mintop++;
				minStack[mintop] = data;
			}
		}
	}

	public int pop() {
		mintop--;
		return (actualStack[top--]);
	}

	public int getMin() {
		return minStack[mintop];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public int minPeek() {
		return minStack[mintop];
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindMinimumInStack stackObj = new FindMinimumInStack(10);
		stackObj.push(8);
		System.out.println(stackObj.getMin());
		stackObj.push(3);
		stackObj.push(5);
		System.out.println(stackObj.getMin());
		stackObj.push(6);
		stackObj.push(7);
		stackObj.push(1);
		System.out.println(stackObj.getMin());
		stackObj.push(9);
		System.out.println(stackObj.getMin());

	}

}
