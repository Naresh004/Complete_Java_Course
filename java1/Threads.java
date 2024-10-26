package java1;

class Myclass extends Thread{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getId()+" - value - "+i);
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
public class Threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass myclass = new Myclass();
		myclass.start();
		Myclass myclass1 = new Myclass(); 
		myclass1.start();
	}

}
