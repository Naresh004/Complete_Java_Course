package java1;

import java.util.Scanner;

public class string {
	public static void main(String[] args) {
//		char[] ch = {'a','b'};
//		String s = new String(ch);
//		System.out.print(s);
//		
//		String s1 = "java";
//		System.out.print(s1);
		
		int i;
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		String[] arr =new String[5];
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextLine();
		}
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr[0]);

	}


}
