package java1;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try
			{
			int data=100/0;
			}catch(ArithmeticException e){
			System.out.println(e);
			}
			try{
				int a[]=new int[5];
				a[10]=30;
			}catch(ArrayIndexOutOfBoundsException e){  
            System.out.println("ArrayIndexOutOfBounds Exception occurs");  
           }
		}catch(Exception e) {
			System.out.println("outer catch");
		}
		 finally {  
			 System.out.println("finally block is always executed");  
			 }
		System.out.println("rest of the code");
	}
}
