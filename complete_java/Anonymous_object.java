package complete_java;

class A1{
	public A1() {
		System.out.println("object created");
	}
	public void show() {
		System.out.println("showing");
	}
}
public class Anonymous_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new A1().show();  //anonymous object
		new A1().show();
		A1 ob = new A1();
		ob.show();
		ob.show();
	}

}
