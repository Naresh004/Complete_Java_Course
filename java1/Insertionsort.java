package java1;

import java.util.Scanner;

public class Insertionsort {

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
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key){
				 arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}

	}

}
