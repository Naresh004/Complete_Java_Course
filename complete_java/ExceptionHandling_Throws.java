package complete_java;

class nareshException extends RuntimeException
{
	public nareshException(String string) {
		super(string);
	}
}
class eg3{
	public void show() {
		try {
			Class.forName("eg3");
		}catch(ClassNotFoundException e) {
			System.out.println("Not able to find th class"+e);
		}
	}
}
public class ExceptionHandling_Throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=20;
		int j=0;
		try {
			j=18/0;
			if(j==0)
				throw new nareshException("I dont want this");
		}catch(ArithmeticException e) {
			System.out.println("somethingwen...t wrong"+e);
		}
		
		eg3 obj = new eg3();
		obj.show();
	}

}
