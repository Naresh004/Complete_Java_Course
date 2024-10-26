package java1;
import java.util.*;
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size");
		int n=sc.nextInt();
		
		int[] arr=new int[10];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j])
				{
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}
}
