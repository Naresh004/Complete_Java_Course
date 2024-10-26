package complete_java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


//prerequisites for stream api
public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(4,5,6,7,8,9);
		//forloop
//		for(int i=0;i<nums.size();i++) {
//			System.out.println(nums.get(i));
//		}
		//adv forloop
//		for(int n : nums) {
//			System.out.println(n);
//		}
		
		//actual implementation
//		Consumer<Integer> con = new Consumer<Integer>() {
//
//			public void accept(Integer t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//
//		};
//		
//		nums.forEach(con);
//		
		//after using lambda nad anonynous inner cls
		
		nums.forEach(n->System.out.print(n));
		
		int sum=0;
		for(int n: nums) {
				if(n%2==0) {
					n=n*2;
				sum=sum+n;
			}
		}
		System.out.println(sum);

	}

}
