package complete_java;

class AA{
	public void show() {
		System.out.print("A show");
	}
}
class BB extends AA{
	public void show1() {
		System.out.print("B show");
	}
}
public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=4.5;
		int i=(int)d;
		System.out.print(i);
		
		AA obj =(AA) new BB();  //upcasting child to parent
//		AA obj = new BB();  //same as above; by default it will do same
		obj.show();
		
//		obj.show1();//cannot do as it as parent reference
		
		BB ob1 = (BB) obj;
		ob1.show1 ();

	}

}
