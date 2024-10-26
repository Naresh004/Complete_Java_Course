package java1;

class Adder{
	static int add(int a,int b) {
		return a+b;
	}
	static double add(double a,double b) {
		return a+b;
	}
}

public class methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Adder ad=new Adder();
		System.out.print(Adder.add(1.1,11.1));

	}

}
