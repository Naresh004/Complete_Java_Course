package java1;

class Student1{
	int rool;
	String Name;
	static String college="IIT";
	
	static void change() {
		college = "MIT";
	}
	Student1(int r,String n){
		rool = r;
		Name = n;
	}
		
	void display(){System.out.println(rool+" "+Name+" "+college);}  

}

public class staticmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1.change();
		Student1 s1 = new Student1(111,"Karan");  
		Student1 s2 = new Student1(222,"Aryan");  
	    Student1 s3 = new Student1(333,"Sonoo");
	    s1.display();  
	    s2.display();  
	    s3.display(); 
	}

}
