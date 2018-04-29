package datastructures.stack;

/**
 * 
 * @author Raj
 * 
 * This is a stack based on String.
 * 
 * It has three operations - push,push,is Empty
 * 
 * Complexity - O(1)
 *
 */
public class Stack_String{

	private String[] stack;
	private int top;
	
	public Stack_String(int size) throws Exception{
		
		if(size < 1){
			throw new Exception("Size is less");
		}
		stack = new String[size];
		top = -1;
	}
	
	public void push(String data) throws Exception{
		
		if(top == stack.length){
			throw new Exception("stack is full");
		}
		top++;
		stack[top] = data;
	}
	public String pop() throws Exception{
		
		if(top < 0){
			throw new Exception("stack is empty");
		}
		return stack[top--];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public static void main(String[] args) {
		try {
			Stack_String  obj = new Stack_String(6);
			obj.push("Raj");
			obj.push("sek");
			obj.push("rdfd");
			
			for(int i= 0;i<=obj.top;i++){
				System.out.print(obj.stack[i]+" ,");
			}
			System.out.println("after pop");
			obj.pop();
			obj.pop();
			//obj.pop();
			System.out.println("Stack is empty? : "+obj.isEmpty());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
