package complete_java;

class claculat{
	public void show() {
		System.out.print("calc show");
	}
	public void add(int a,int b) {
		System.out.print(a+b);
	}
	
}
class Advaclac extends claculat{
	public void add(int a,int b) {
		System.out.print(a+b+1);
	}	
}

public class FinalKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int n=9;
//		n=6; we can't change
		System.out.print(n);
		Advaclac obj = new Advaclac();
		obj.show();
		obj.add(5,5);
	}

}
