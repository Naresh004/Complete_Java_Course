package java1;

class A{
	void m() {
		System.out.println("hello m");
		this.n();
	}
	void n() {
		System.out.println("hello n");
	}
}

public class thisclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.m();
	}

}
