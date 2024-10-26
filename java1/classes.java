package java1;
import java.util.*;
class class1 {
int id;
String name;
void insert(int a,String b) {
	id=a;
	name=b;	
}
void display() {
	System.out.println(id+" "+name);
}
}
class classes{
public static void main(String[] args) {
	class1 c1=new class1();
	class1 c2=new class1();

	c1.id=101;
	c1.name="naresh";
	
	c2.id=10101;
	c2.name="naresh kumar";
	
	c1.insert(123,"sai");
	c2.insert(123123,"sasaii");

	c1.display();
	c2.display();
	
	
	System.out.print(c1.id+"\n"+c1.name);
	System.out.print("\n"+c2.id+"\n"+c2.name);

	
}
}
