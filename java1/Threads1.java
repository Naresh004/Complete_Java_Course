package java1;

class Myclasshhh implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
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
public class Threads1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new Myclasshhh());
		Thread t2 = new Thread(new Myclasshhh());
		t1.start();
		t2.start();
	}

}
