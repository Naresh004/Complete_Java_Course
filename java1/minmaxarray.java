package java1;
import java.util.*;
public class minmaxarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,max=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] =new int[10];
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		int min=arr[0];
		for(i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("max = "+max);
		System.out.println("min = "+min);

	}

}
