package java1;

public class StackRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dynamicstack nums = new Dynamicstack();
		System.out.println("isEmpty:"+nums.isempty());

		nums.push(5);
		nums.push(6);
		nums.push(7);
		
//		System.out.println("peek:"+nums.peek());
				
		nums.push(8);
//		nums.push(9);
		System.out.println("peek:"+nums.peek());

		System.out.println("size:"+nums.size());
		
		System.out.println("isEmpty:"+nums.isempty());
		
//		System.out.println("pop:"+nums.pop());
		
		nums.show();

	}

}
