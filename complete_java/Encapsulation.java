package complete_java;


class Human{
	private int age;
	private String name;
	
	public Human() {  //deafult constructor
		age=12; //default value of age
		name="jhon";  //default value of name
		System.out.print("in constructor");
	}
	
	public Human(int age,String name) { //Parameterized constructor
		this.age=age;
		this.name=name;
		System.out.println("in constructor p");
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String n) {
		name = n;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human obj = new Human();
		Human obj2 = new Human(18,"sai");

		obj.setAge(11);
		obj.setName("sai");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());

	}

}
