package com.datastructures.queue;

import java.util.Stack;

/**
 * Queue using Stack
 * 
 * @author Rajasekar
 *
 */
public class QueueUsing_TwoStacks {

	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> temp = new Stack<Integer>();
	
	public void push(int data){
		if(stack.isEmpty()){
			stack.push(data);
		}else{
			int size = stack.size();
			for(int i =0;i<size;i++){
				temp.push(stack.pop());
			}
			stack.push(data);
			for(int i =0;i<size;i++){
				stack.push(temp.pop());
			}
		}
	}
	
	public void pop(){
		
		System.out.println("Dequeued  +  :"+stack.pop());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QueueUsing_TwoStacks queue = new QueueUsing_TwoStacks();
		queue.push(2);
		queue.push(3);
		queue.push(1);
		queue.push(5);
		queue.push(10);
		queue.push(0);
		
		queue.pop();
		queue.pop();
		queue.pop();
		queue.pop();
		queue.pop();
		queue.pop();
		

	}

}
