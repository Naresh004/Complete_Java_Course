package complete_java;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class trrycatchbuffer2 {

//	try with resuorces
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int num=0;
		int x=0;
//		using bufferreader
//		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) 
//		{
//			num=Integer.parseInt(br.readLine());
//			System.out.println(num);
//		}
//		using scannercls
		try(Scanner sc = new Scanner(System.in))
		{
			x=(sc.nextInt());
			System.out.println(x);
		}

	}

}
