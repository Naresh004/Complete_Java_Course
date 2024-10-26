package complete_java;
//same as cls but we cannot extends class
enum Status{
	Running,Failed,Pending,Success;
}

public class Enumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =5;
		Status s = Status.Running;
		System.out.print(s);
		System.out.print(s.ordinal());
		
		Status[] ss = Status.values();
		for(Status s1 : ss) {
			System.out.println(s1 +" "+s1.ordinal());
		}


	}

}
