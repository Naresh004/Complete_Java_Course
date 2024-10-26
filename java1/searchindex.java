package java1;

public class searchindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		searchindex ob=new searchindex();
		int[] a= {1,2,3,4,5};
		int k=3;
		ob.searchs(a,k);
	}
	public void searchs(int a[],int k)
	{
		for(int i=0;i<a.length;i++) {
			if(a[i]==k)
			{
				System.out.print(i);
			}
		}

	}

}
