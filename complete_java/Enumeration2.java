package complete_java;

enum Status1{
	Running,Failed,Pending,Success;
}

public class Enumeration2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Status1 s = Status1.Running;
		if(s==Status1.Running) {
			System.out.println("All good");
		}
		else if (s==Status1.Failed) {
			System.out.println("Try agin");

		}
		
		switch(s)
		{
		case Running:
			System.out.println("All good");
		}//.......................switch will also work

	}

}
