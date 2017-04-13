package com.datastructures.stack;

/**
 * 
 * @author Raj
 * 
 * This is a stack based on char.
 * 
 * It has five operations - push,push,peek,top,is Empty
 * 
 * Complexity - O(1)
 *
 */
public class Stack_Char {
	public char[] Stack;
	public int top;

	//COnstructor
	public Stack_Char(int size) throws Exception {

		if (size <= 0) {
			throw new Exception("size is less than Zero(0)");
		}
		this.Stack = new char[size];
		this.top = -1;
	}

	//Push Data
	public void push(char data) throws Exception {

		if (top == Stack.length) {
			throw new Exception("Stack is full");
		} else {
			top++;
			Stack[top] = data;
		}
	}

	//Pop Data
	public char pop() throws Exception {
		if (top == -1) {
			throw new Exception("Stack is Empty");
		}
		return Stack[top--];

	}

	//IsEmpty
	public boolean isEmpty() {
		return (top == -1);
	}

	//Peek
	public char peek() throws Exception {
		if (top == -1) {
			throw new Exception("Stack is Empty");
		}
		return Stack[top];
	}
	//top
	public char top(){
		return Stack[top];
	}
	
}
