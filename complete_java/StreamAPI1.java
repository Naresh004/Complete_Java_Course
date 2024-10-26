package complete_java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(4,5,6,7,8,9);
		//nums remains same.
		//stream works only once
		Stream<Integer> st1 = nums.stream(); 
		Stream<Integer> st2 = st1.filter(n->n%2==0); //filter returns a stream
		Stream<Integer> st3 = st2.map(n->n*2); //filter returns a stream

		 
		
		st3.forEach(n->System.out.println(n));
		
		int result = nums.stream()
				.filter(n->n%2==0) //filetr needs an a object of a predicate whcih as a method test
				.map(n->n*2)
				.reduce(0,(c,e)->(c+e));
		
		System.out.println("res"+result);
	}

}
