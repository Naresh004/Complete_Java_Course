package complete_java;

class A{
	public A() {
		System.out.print("in A");
	}	
	public A(int a) {
		System.out.print("in A int");
	}
	
}
class B extends A{
	
	public B() {
		super();
		System.out.print(" in B");
	}
	public B(int n) {
		this();
		System.out.print(" in B int");
	}
}
public class This_and_Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B(5);

	}

}
