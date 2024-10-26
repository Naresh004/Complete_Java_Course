package java1;

public class QueueRunner {
	
	int queue[] = new int[5];
	int size;
	int front=0;
	int rare=0;
	
	
	public void enqueue(int data) {
		
		queue[rare] = data;
		rare++;
		size++;
	}
	
	public int dequeue() {
		int data;
		data=queue[front];
		front++;
		size--;
		return data;		
		
	}
	
}
