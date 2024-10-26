package complete_java;

class Mobile{
	String brand;
	int price;
	static String name;
	
	public void show() {
		System.out.println(brand + " : "+ price + " : " +name);
	}
	
}
public class staticvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile ob1 = new Mobile();
		ob1.brand = "Apple";
		ob1.price = 1200;
		ob1.name = "sartphone";
		
		Mobile ob2 = new Mobile();
		ob2.brand = "samsung";
		ob2.price = 1000;
		Mobile.name = "sartphone"; //we directly access through class name as static variables belongs to classes not objects
		
		ob1.name="TAB"; //if we change for one obj it will reflects for other obj also
		ob1.show();
		ob2.show();

	}

}
