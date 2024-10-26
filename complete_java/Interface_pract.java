package complete_java;

interface computer{

	void Code();
	
}
class Laptop implements computer{
	public void Code() {
		System.out.print(" code,run and compile..");
	}
}
class Desktop implements computer{
	public void Code() {
		System.out.print(" code,run,Faster and compile..");
	}
}

class Developer{
	public void devApp(computer ob) {
		ob.Code();
	}
}
public class Interface_pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer naresh = new Developer();
//		Laptop lap = new Laptop();
//		Desktop desk = new Desktop();
		
		computer lap = new Laptop();
		computer desk = new Desktop();
		naresh.devApp(desk);

	}

}
