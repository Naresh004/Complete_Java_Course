package java1;
class Animal{
	void eat() {
		System.out.println("eating");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("barking....");
	}
}
class babydog extends Animal{
	void puppy() {
		System.out.println("puppies");
	}
}
public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		babydog ob = new babydog();
		Dog ob1=new Dog();
		ob.eat();
		ob1.bark();
		ob.puppy();

	}

}
