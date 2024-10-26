package complete_java;

class loop1 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
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
class loop2 extends Thread{
	public void run() { //method name should be run
		for(int i=0;i<100;i++) {
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
public class Threads1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		loop1 obj1 = new loop1();
		loop2 obj2 = new loop2();
		
		obj1.setPriority(Thread.MAX_PRIORITY);
		obj1.start();
		obj2.start();

	}

}
