package complete_java;

class clac{
	public int add(int a,int b) {
		return a+b;
	}
}
class clac1 extends clac{
	public int sub(int a,int b) {
		return a-b;
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clac1 obj = new clac1();
		int r1 = obj.sub(5, 5);
		int r2 = obj.add(5, 5);
		System.out.println(r1+" "+r2);
	}

}
