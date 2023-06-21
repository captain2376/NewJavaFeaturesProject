package cgg.streamsoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamExample {

	public static void main(String[] args) {
		
		List<Product> prodList = Arrays.asList(new Product("Potatoes",23),
				new Product("Sweet Potatoes",22),
				new Product("Orange",24),
				new Product("Lemon",14)	);
		///creating parallel stream from collections
		
		Stream<Product> streamCollection = prodList.parallelStream();
		boolean parallel = streamCollection.isParallel();
		System.out.println(parallel);
		boolean bigPrice = streamCollection.map(product->product.getProductPrice()*12).anyMatch(price->price>200);
		System.out.println(bigPrice);
		
		//2/creating parallel stream from IntStream,LongStream,DoubleStream
		
		//it has parallel method instead of parallelstream method
		System.out.println("---------------------------");
		IntStream intStreamParallel = IntStream.range(1, 150).parallel();
		boolean parallel2 = intStreamParallel.isParallel();
		System.out.println(parallel2);
		
		System.out.println("------------------");
		
		//3.converting stream from parallel to sequential mode
		IntStream intStreamSequential = intStreamParallel.sequential();
		boolean parallel3 = intStreamSequential.isParallel();
		System.out.println(parallel3);
		
		
		
		
		
	}

}
