 package complete_java;

class counter{
	int count;
	public synchronized void increment() {  //synchronized is used to stop running threads at same time.(they wont run concurently)   
		count++;
	}
}

public class Threads_RaceConditions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		counter c = new counter();

		Runnable obj1 = ()->{//anonymous cls and lambda expression 
			for(int i=1;i<=1000;i++) {
				c.increment();
			}
		}; 
		
		Runnable obj2 = ()->{//anonymous cls and lambda expression 
			for(int i=1;i<=1000;i++) {
				c.increment();				
			}
		}; 
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
		t1.join(); // Wait for t1 to complete
        t2.join(); // Wait for t2 to complete
        
		System.out.println(c.count);

	}

}
