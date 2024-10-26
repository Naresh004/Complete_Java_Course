package complete_java;
//
//class loop111 implements Runnable{
//	public void run() {
//		for(int i=0;i<5;i++) {
//			System.out.println("hi");
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
////}
//class loop222 implements Runnable{
//	public void run() { //method name should be run
//		for(int i=0;i<5;i++) {
//			System.out.println("hello");
//			try {  //to wait some time
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//}

public class Threads3_lambda {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable obj1 = ()->{//anonymous cls and lambda expression 
				for(int i=0;i<5;i++) {
					System.out.println("hi");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}; 
		Runnable obj2 = ()->{//anonymous cls and lambda expression 
			for(int i=0;i<5;i++) {
				System.out.println("helllo");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}; 
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();

	}

}
