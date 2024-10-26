package complete_java;

class sample5{
	public void show() throws Exception {
			int a=10;
			int b = 0;
			int c=a/b;
			System.out.println("result :"+c);
	}
}
public class ExceptionThrows {
	static {
		System.out.println("class loadre");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample5 obj = new sample5();
		try {
			obj.show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Reason: "+e);
		} //error beacuse throws exception must handled

	}

}
