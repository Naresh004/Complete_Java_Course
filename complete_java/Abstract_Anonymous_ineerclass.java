package complete_java;

abstract class AAA{
	public abstract void show();
}

public class Abstract_Anonymous_ineerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA obj = new AAA()
		{                                //anonymous inner class
			public void show() {
				System.out.println("new show");
			}
		};
		obj.show();

	}

}
