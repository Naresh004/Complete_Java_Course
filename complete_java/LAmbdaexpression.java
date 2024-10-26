package complete_java;

interface eg01{
	int show(int i,int j);
}
public class LAmbdaexpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eg01 ob = (i,j)-> 
			{
				return i+j;
			};
		int r = ob.show(5,5);
		System.out.print(r );
	}

}
