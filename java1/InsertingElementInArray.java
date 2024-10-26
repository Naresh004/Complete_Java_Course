package java1;

public class InsertingElementInArray {
	int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertingElementInArray ob = new InsertingElementInArray(); 
		
		int a[]=new int[6];
//		a[0]=1;
//		a[1]=2;
//		a[2]=3;
//		a[3]=4;
//		a[4]=5;
		
		for(int j=0;j<a.length;j++) {
			ob.insert(a,j+1);
		}
		
		ob.insertatstart(a, 56);
		ob.insertatposition(a,2,65);
		ob.print(a);
	}
	public void insert(int a[],int val) {
		a[count++]=val;
			
	}
	
	public void insertatstart(int a[],int val) {
		for(int i=a.length-1;i>0;i--)
		{
			a[i]= a[i-1];
		}
		a[0]=val;
	}
	
	public void insertatposition(int a[],int p,int val) {
		for(int i=a.length-1;i>p;i--)
		{
			a[i]= a[i-1];
		}
		a[p]=val;
	}
	
	public void print(int a[])
	{
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");			
		}
	}

}

