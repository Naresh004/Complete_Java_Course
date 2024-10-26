package java1;

class student{
	int r;
	String name;
	static String college = "IIT";
	
	student(int m,String n){
		r=m;
		name=n;			
	}
	  void display (){System.out.println(r+" "+name+" "+college);}  
	}  

public class staticeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student(111,"Karan");  
		student s2 = new student(222,"Aryan");  
		 //we can change the college of all objects by the single line of code  
		 student.college="BBDIT";  
		 s1.display();  
		 s2.display();  

	}

}
