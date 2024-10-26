package java1;
abstract class Bike{
	abstract void run();	

}
class Abstractcls extends Bike {
	void run() {
		System.out.print("running safley");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractcls b=new Abstractcls();
		b.run();	

	}

}
