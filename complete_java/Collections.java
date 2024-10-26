package complete_java;

import java.util.ArrayList;
import java.util.Collection;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Collection<Integer> nums = new ArrayList<Integer>();
		 nums.add(1);
		 nums.add(2);
		 nums.add(3);
		 nums.add(4);
		 nums.add(5);
		 nums.add(6);
		 nums.add(7);
		 
		 for(int x : nums) {
			 System.out.print(x);
		 }

	}

}
