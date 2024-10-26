package complete_java;
import java.util.*;
import java.util.Collections;

class student9{
	int age;
	String name;
	
	public student9(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public String toString() {
		return "student [age=" + age + ", name=" + name + "]";
	}
}
public class collectionscomparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<student9> com = new Comparator<student9>() {
			public int compare(student9 i ,student9 j) {
				if(i.age>j.age)
					return 1;
				else
					return -1;
			}
		};
		
		List<student9> studs = new ArrayList<>();
		 studs.add(new student9(21,"sai"));
		 studs.add(new student9(23,"ram"));
		 studs.add(new student9(42,"rai"));
		 studs.add(new student9(31,"kiran"));
		 studs.add(new student9(91,"varun"));

		 Collections.sort(studs,com);		 
		 for(student9 s: studs) {
			 System.out.println(s);

		 }

	}

}
