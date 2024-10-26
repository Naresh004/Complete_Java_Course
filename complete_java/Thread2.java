package complete_java;

class loop11 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("hi");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class loop22 implements Runnable{
	public void run() { //method name should be run
		for(int i=0;i<5;i++) {
			System.out.println("hello");
			try {  //to wait some time
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Thread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable obj1 = new loop11();  //refrence of a interface "Runnable" and object of the class
		Runnable obj2 = new loop22();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();

	}

}
