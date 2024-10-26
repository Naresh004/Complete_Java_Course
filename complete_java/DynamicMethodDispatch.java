package complete_java;
class Abc{
	public void show() {
		System.out.println("in Abc show");
	}
}
class Bc extends Abc{
	public void show() {
		System.out.println("in Bc show");
	}
}
class Cd extends Abc{
	public void show() {
		System.out.println("in B show");
	}	
}
public class DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj1 = new Abc();
		obj1.show();
		
		obj1 = new Bc();
		obj1.show();		
		
		obj1 = new Cd();
		obj1.show();
	}

}
