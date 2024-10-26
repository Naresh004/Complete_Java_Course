package java1;
import java.util.*;;

public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		//reading value from the user  
		int num=scan.nextInt();  
		//method calling  
		findEvenOdd(num); 

	}
public static void findEvenOdd(int num)  
{  
//method body  
if(num%2==0)   
System.out.println(num+" is even");   
else   
System.out.println(num+" is odd");  
}
}