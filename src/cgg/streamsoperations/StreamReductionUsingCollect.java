package cgg.streamsoperations;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamReductionUsingCollect {

	public static void main(String[] args) {
		
		List<Product> prodList = Arrays.asList(new Product("Potatoes",23),
				new Product("Sweet Potatoes",22),
				new Product("Orange",24),
				new Product("Lemon",14)	);
		//convert stream to collectoion
		//method(prodList);
		
		//Summarizing int
		
		IntSummaryStatistics collect = prodList.stream().collect(Collectors.summarizingInt(Product::getProductPrice));
		System.out.println(collect);
		//int summary statistics:max,min,sum,average ...
		
		System.out.println("---------------------");
		//grouping by method
		
		Map<Integer,List<Product>> collect2 = prodList.stream().collect(Collectors.groupingBy(Product::getProductPrice));
		//it returns a map so we use for each method to traverse and print using lambda function
		
		collect2.forEach((k,v)->{
			System.out.println(k+" "+v);
		});
		
		//divide stream element according to some predicate
		//Dividing Stream's elements into groups according to some predicate
		Map<Boolean,List<Product>> collect3 = prodList.stream().collect(Collectors.partitioningBy(p->p.getProductPrice()>22));
		
		collect3.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
		
		//Pushing the collector to perform additional transformation
		
		System.out.println("-----------------------------");
		Set<Product> collect4 = prodList.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet));
		collect4.forEach(System.out::println);
		
		
	}

	@SuppressWarnings("unused")
	private static void method(List<Product> prodList) {
		List<String> collect=prodList.stream().map(Product::getProductName).collect(Collectors.toList());
		collect.forEach(System.out::println);
		
		System.out.println("------------------------");
		//reduce to string
		//,-delimter
		//[-prefix
		//]-suffix
		String collect2 = prodList.stream().map(Product::getProductName).collect(Collectors.joining(",","[","]"));
		System.out.println(collect2);
		
		System.out.println("-----------------");
		//average price
		//this is method reference
		Double avgPrice = prodList.stream().collect(Collectors.averagingInt(Product::getProductPrice));
		System.out.println(avgPrice);
	}

}
