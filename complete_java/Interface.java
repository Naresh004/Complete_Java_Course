package complete_java;

interface bAa{
	int age=60;   //by default these are final and static so we need to intialize(i.e assign)
	String area="HYD";
	void show();
	void config();
}
class abcd implements bAa{

	public void show() {
		System.out.println("show");	
	}

	public void config() {
		System.out.println("config");
	}	
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abcd ob = new abcd();
		ob.config();
		ob.show();
		
		System.out.println(bAa.age);

	}

}
