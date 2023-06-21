package cgg.streamsoperations;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamReductionExample {

	public static void main(String[] args) {
		OptionalInt reduced = IntStream.range(1, 4).reduce((a,b)->a+b);
		//only accumulator
		System.out.println(reduced.getAsInt());
		System.out.println("------------------");
		//int binary operator
		//identity accumulator
		//intital value is 10 and sum of 1,2,3 is added to 10::accumulator variation
		int reduceTwoParams = IntStream.range(1, 4).reduce(10,(a,b)->a+b);
		
		System.out.println(reduceTwoParams);
		
		System.out.println("-----------------");
		//accumulator combiner example
		Integer reduce = Arrays.asList(1,2,3,4).parallelStream().reduce(10, (a,b)->a+b, (a,b)->{
			System.out.println("Combiner called");
			return a+b;
		});
		//input was divide as 1thread-10+1,2thread:10+2,thread3=10+3,multiple threads as they are parallel streams
		//11,12,13->combiner wil do following operations
		//11,12+13
		//11+25
		//36
		//combiner will operate in reverse order-it will work right to left
		System.out.println(reduce);
		System.out.println("---------------");
	}

}
