package complete_java;
import java.util.*;
public class Basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");

//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int arr1[] = new int[n];
//		for(int k=0;k<n;k++) {
//			arr1[k]=sc.nextInt();
//		}
//		for(int k=0;k<n;k++) {
//			System.out.println(arr1[k]/2);
//		}
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int arr1[] = new int[n];
		for (int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		for (int i=0;i<n;i++) {
			System.out.println(arr1[i]);
		}
	}

}
