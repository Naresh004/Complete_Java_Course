package java1;
interface printable{
	void print();
}
class interfacee implements printable {
	public void print() {
		System.out.print("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfacee ob = new interfacee();
		ob.print();

	}

}
