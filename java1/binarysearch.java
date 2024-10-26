package java1;

public class binarysearch {

	public static void BS(int a[],int first,int last,int k) {
		int m=(first+last)/2;
		while(first<=last) {
			if(a[m]>k) {
				last=m-1;
			}else if(a[m]==k)
			{
				System.out.println("Element is found at index: " + m);  
			break;
			}else {
				first=m+1;
			}
			m = (first + last)/2;  
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6};
		int k=4;
		int last=a.length-1;
		BS(a,0,last,k);

	}

}
