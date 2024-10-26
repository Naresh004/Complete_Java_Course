package java1;
import java.util.ArrayList;
public class Collections1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> myList=new ArrayList<Integer>(5);
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(11);
		myList.add(21);
		myList.add(31);
		for(Integer x : myList)
			System.out.print("-"+x);
		
		System.out.println(" "+myList.size());
		myList.remove(2);
		myList.set(1, 10000);
		for(Integer x : myList)
			System.out.print("-"+x);

		System.out.println(" "+myList.size());
		for(Integer x : myList)
			if(x==10000) {
			System.out.print("-"+(x+5));
			}

	}

}
