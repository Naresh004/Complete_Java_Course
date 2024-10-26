package complete_java;
//functional interface i.e only one method
//@FunctionalInterface  //annotation
interface example{
	void show();
}
//class eg implements example{
//
//	@Override
//	public void show() {
//		System.out.print("show");
//		
//	}
//	
//}

public class Functional_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example ob = new example() {  //Anonymous Inner classs
			public void show() {
				System.out.print("show..");
			}
		};
		ob.show();

	}

}
