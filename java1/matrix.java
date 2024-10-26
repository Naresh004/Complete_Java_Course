package java1;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,3},{1,2,3},{1,2,3}};
		int b[][] = {{1,2,3},{1,2,3},{1,2,3}};

		int c[][] = new int[3][3];
		int i,j;
		for(i=0;i<a.length;i++) {
			for(j=0;j<b.length;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();//new line    		

		}
		System.out.println("_______________");//new line    		
		
		for(i=0;i<a.length;i++) {
			for(j=0;j<b.length;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[j][i]+" ");
			}
			System.out.println();//new line    		

		}
	}

}
