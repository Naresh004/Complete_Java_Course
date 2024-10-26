package complete_java;

class AAAA{
	public void show() {
		System.out.println("old show");
	}
}
public class Anonymous_innercls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAAA obj = new AAAA()
		{                                //anonymous inner class
  			public void show() {
				System.out.println("new show");
			}
		};
		obj.show();

	}

}
