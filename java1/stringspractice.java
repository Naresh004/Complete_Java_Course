package java1;

import java.util.Scanner;

public class stringspractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "my name is naresh kumar";
		int c=0;
//		for(int i=0;i<str.length();i++) {
//			System.out.print(str.charAt(i));
//		}
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!= ' ') {
				c++;				
			}
		}
        System.out.println("Total number of characters in a string: " + c);    

	}
}

