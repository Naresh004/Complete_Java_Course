package java1;

public class Stack {
	int stack[] = new int[5];
	int top = 0;
	
	public void push(int data) {
		stack[top] = data;
		top++;
	}
	
	public int pop() {
		int data;
		top--;
		data=stack[top];
		stack[top]=0;
		return data;
	}
	
	public int peek() {
		int data;
		data=stack[top-1];
		return data;
	}
	public int size(){
		return top;
	}
	public boolean isempty(){
		if(top<=0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void show() {
		for(int i=0;i<stack.length;i++) {
			System.out.println(stack[i]);
		}
	}

}


