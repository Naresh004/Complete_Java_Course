package complete_java;

abstract class Demo001{
	abstract void pink();
}
class DEmo002 extends Demo001{

	@Override
	void pink() {
		// TODO Auto-generated method stub	
	}	
}
interface myinter{
	void blue();
}
class myinterface implements myinter{

	@Override
	public void blue() {
		// TODO Auto-generated method stub
		
	}
	
}
class Demo5{
	public void Dog() {
		System.out.println("bark.......");	
	}
}
class Demo6 extends Demo5{
	public void cat() {
		System.out.println("meow.......");
	}
}
public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo5 ob = new Demo5();
		Demo6 ob0 = new Demo6();

		ob.Dog();
		ob0.cat();
		ob0.Dog();


	}

}
