package java1;
import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> names=new HashSet<String>();
		names.add("Mark");
		names.add("sdbv");
		names.add("kesi");
		names.add("hfdk");
		names.add("hfdk");
		
		Iterator<String> itr = names.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
			
		System.out.println(" ");
		System.out.println(" ");
		


	}

}
