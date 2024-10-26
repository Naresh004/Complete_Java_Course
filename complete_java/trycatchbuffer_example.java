package complete_java;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class trycatchbuffer_example {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int num=0;
		BufferedReader br = null;
		try {
			InputStreamReader in = new InputStreamReader(System.in);
			br = new BufferedReader(in);
			num=Integer.parseInt(br.readLine());
			System.out.println(num);
		}
		
		finally {
			br.close();
		}

	}

}
