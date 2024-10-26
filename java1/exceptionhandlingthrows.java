package java1;

public class exceptionhandlingthrows {
	
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("not eligible");
		}
		else {
			System.out.println("eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(26);
		System.out.println("rest of the code...");  

	}

}
