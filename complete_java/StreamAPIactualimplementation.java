package complete_java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPIactualimplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums = Arrays.asList(4,5,6,7,8,9);
		//nums remains same.
		//stream works only once
		Stream<Integer> st1 = nums.stream(); 
		Stream<Integer> st2 = st1.filter(n->n%2==0); //filter returns a stream
		Stream<Integer> st3 = st2.map(n->n*2); //filter returns a stream

		 
		
		st3.forEach(n->System.out.println(n));
		
		Predicate<Integer> pred = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				if(t%2==0)
					return true;
				else
					return false;
			}
			
		};
		
		Function<Integer,Integer> fun = new Function<Integer,Integer>() {

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t*2;
			}
			
		};
		
		
		
		int result = nums.stream()
				.filter(pred) //Filter needs an a object of a predicate which as a method test
				.map(fun) //map takes an object of Function which as apply method
				.reduce(0,(c,e)->(c+e));
		
		System.out.println("res"+result);
	}


}
