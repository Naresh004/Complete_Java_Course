package complete_java;
class demo{
	public void showTheMethodsAsOutput() {
		System.out.print("demo");
	}
}

class demo1 extends demo{
//	@Override //annotation : used to debugging at compiletime
//	public void showTheMethodAsOutput() {  //by mentioning ovverride 
////		we can see the error(difference in function name) if not it is difficut to find by our eyes
//		
//		System.out.print("demo111");
//	}
}
public class Annotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1 ob = new demo1();
		ob.showTheMethodsAsOutput();

	}

}
