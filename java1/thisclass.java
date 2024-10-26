package java1;
class study{
	int roll;
	String name;
	float fee;
	
	study(int roll,String name,float fee){
		this.roll=roll;
		name=name;
		this.fee=fee;
	}
	void display(){System.out.println(roll+" "+name+" "+fee);}  

}
public class thisclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		study s1=new study(111,"ankit",5000f);  
		study s2=new study(112,"sumit",6000f);  
		s1.display();  
		s2.display();  

	}

}
