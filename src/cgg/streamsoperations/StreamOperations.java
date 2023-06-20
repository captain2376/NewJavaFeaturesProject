package cgg.streamsoperations;

import java.util.ArrayList;

public class StreamOperations {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add( "The");
		list.add( "Quick");
		list.add( "Brown");
		list.add("fox");
		list.add( "Jumped");
		list.add( "over");
		list.add("the");
		list.add("dog");
		
		/*
		 * Stream<String> stream = list.stream();//intermeditate operation
		 * Stream<String> distinct = stream.distinct();//intermediate operation long
		 * count = distinct.count();//terminal operation System.out.println(count);
		 */
		//instead of above three steps using chaining

		long count = list.stream().distinct().count();
		System.out.println(count);//this is called chaining and pipeling
		
		//streams cannot be reused
	
		boolean anyMatch = list.stream().anyMatch(e->e.contains("g"));
		System.out.println(anyMatch);
		boolean allMatch = list.stream().allMatch(e->e.contains("g"));
		System.out.println(allMatch);
		boolean noneMatch = list.stream().noneMatch(e->e.contains("g"));
		System.out.println(noneMatch);

	}

}
