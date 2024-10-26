package complete_java;

import java.util.HashMap;
import java.util.Map;

public class ClHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> students = new HashMap<>();
		students.put("NAresh", 10);
		students.put("sai", 11);
		students.put("ram", 12);
		students.put("krishna", 13);
		students.put("suresh", 14);
		
		System.out.println(students);
		System.out.println(students.containsKey("sai"));



	}

}
