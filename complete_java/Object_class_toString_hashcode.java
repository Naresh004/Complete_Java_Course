package complete_java;


class Laptops{
	String model;
	int price;
	
	public String toString() {
		return model+" "+price;
	}
}

public class Object_class_toString_hashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptops obj = new Laptops();
		obj.model = "lenovo";
		obj.price = 1000;
		
		Laptops obj1 = new Laptops();
		obj1.model = "lenovo";
		obj1.price = 1000;
		
		boolean result = obj == obj1;
		boolean result1 = obj.equals(obj1);

		System.out.println(obj );
		System.out.println(result );
		System.out.println(result1);

	}

}
