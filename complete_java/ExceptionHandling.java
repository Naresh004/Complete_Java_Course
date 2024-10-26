 package complete_java;
class MYexcep extends RuntimeException{ //our own exception
	public MYexcep(String string) { //constructor
		super(string);
	}
}
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		int y=20;
		try {
			x = 18/y;
			if(x==0)
				throw new MYexcep("my exception......");
		}catch(MYexcep e) {
			System.out.println("somethingwen...t wrong"+e);
		}
		finally {  
			 System.out.println("finally block is always executed");  
			 }
		System.out.println(x);

	}

}
