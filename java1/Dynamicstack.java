package java1;

public class Dynamicstack {
	
	int capacity = 2;
	int stack[] = new int[capacity];
	int top = 0;
	
	public void push(int data) {
		
		if(size()==capacity) {
			expand();
		}
		stack[top] = data;
		top++;
	}
	
	private void expand() {
		
		int length=size();
		int newstack[] = new int[capacity*2];
		System.arraycopy(stack, 0, newstack, 0, length);
		stack = newstack;
		capacity*=2;
	
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


