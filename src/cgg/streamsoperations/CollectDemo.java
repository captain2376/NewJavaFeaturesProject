package cgg.streamsoperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectDemo {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add( "Aaar");
		names.add("vaar");
		names.add("grrrr");
		names.add( "rare");
		
		// first i want to apply conversion on these elements-map method
		
		//names.stream().map(n->n.toUpperCase()) ::map which converts a list elements into uppercase
		
		//now use collectors to covert this stream into a list
		List<String> collect = names.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);
	}
	

}
