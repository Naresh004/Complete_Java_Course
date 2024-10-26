package java1;

import java.util.Scanner;

public class Selecttionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size");
		int n=sc.nextInt();
		
		int[] arr=new int[5];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<n;i++) {
			int k=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[k]) {
					k=j;
				}
			}
			int s=arr[k];
			arr[k]=arr[i];
			arr[i]=s;

	}
		 for(int i:arr){  
	            System.out.print(i+" ");  
	        }  

}
}
