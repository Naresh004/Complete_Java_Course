package complete_java;

public class Exceptionthrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10;
			int b = 0;
			if(b==0)
				throw new Exception("divide by 0 may cause exception");
			int c=a/b;
			System.out.println("result :"+c);
	}catch(Exception e) {
		System.out.println("Exception is "+e);
	}
	}

}
