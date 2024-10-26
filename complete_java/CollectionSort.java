package complete_java;
import java.util.*;
import java.util.Collections;
public class CollectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<Integer> com = new Comparator<Integer>() {
			public int compare(Integer i ,Integer j) {
				if(i%10>j%10)
					return 1;
				else
					return -1;
			}
		};
		
		List<Integer> nums = new ArrayList<>();
		 nums.add(12);
		 nums.add(23);
		 nums.add(38);
		 nums.add(34);
		 nums.add(5);
		 nums.add(16);
		 nums.add(7);
		 
		 Collections.sort(nums,com);
		 System.out.print(nums);
		 
		 

	}

}
