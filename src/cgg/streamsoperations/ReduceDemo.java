package cgg.streamsoperations;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,23,4,5);
		Integer reduce = integers.stream().reduce(0,(a,b)->a+b);
		System.out.println(reduce);
		
	
	}

}
