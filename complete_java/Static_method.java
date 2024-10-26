package complete_java;

class Mobiles{
	String brand;
	int price;
	static String name;
	
	public void show() {
		System.out.println(brand + " : "+ price + " : " +name);
	}
	public static void show1() {
		System.out.println(name); //cannot access non static variables directly
	}
	
	public static void show2(Mobiles obj) { //access non static variables using object reference
		System.out.println(obj.brand + " : "+ obj.price + " : " +name);
	}
}
public class Static_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobiles ob1 = new Mobiles();
		ob1.brand = "Apple";
		ob1.price = 1200;
		ob1.name = "sartphone";
		
		Mobiles ob2 = new Mobiles();
		ob2.brand = "samsung";
		ob2.price = 1000;
		Mobiles.name = "sartphone"; //we directly access through class name as static variables belongs to classes not objects
		
		ob1.name="TAAB"; //if we change for one obj it will reflects for other obj also
		ob1.show();
		ob2.show();
		
		Mobiles.show1();
		Mobiles.show2(ob1);


	}

}
