package java1;
import java.util.*;
public class Listiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>();
		names.add("Mark");
		names.add("sdbv");
		names.add("kesi");
		names.add("hfdk");
		names.add("hfdk");

		ListIterator<String> itr = names.listIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
			
		System.out.println(" ");
		System.out.println(" ");
		
		while(itr.hasPrevious())
			System.out.println(itr.previous());


	}

}
