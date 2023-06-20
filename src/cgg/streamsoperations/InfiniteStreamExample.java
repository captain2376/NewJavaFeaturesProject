package cgg.streamsoperations;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreamExample {

	public static void main(String[] args) {

		Stream<Integer> iterate = Stream.iterate(20, i -> i + 2);// infinite stream

		// convert stream of infinite integers into a finite list of length-10 using
		// limit operation

		List<Integer> collect = iterate.limit(10).collect(Collectors.toList());

		collect.forEach(System.out::println);
		System.out.println("Empty stream");
		Stream<String> empty = Stream.<String>empty();
		System.out.println(empty);
		System.out.println("----------------");
		List<String> asList = Arrays.asList("a", "b", "c", "d");
		Stream<String> stream = asList.stream();
		System.out.println(stream);
		System.out.println("---------------------------");
		String[] arr = { "a", "b", "c" };
		Stream<String> stream2 = Arrays.stream(arr);
		Arrays.stream(arr, 1, 3);
		stream2.forEach(System.out::println);
		System.out.println("--------------");

		Stream<String> build = Stream.<String>builder().add("AA").add("lol").build();
		build.forEach(System.out::println);
		System.out.println("static method______________________");
		System.out.println("--------------------------");

		Stream<String> limit = Stream.generate(() -> "Hello").limit(10);
		limit.forEach(System.out::println);

		System.out.println("--------------");

		IntStream range = IntStream.range(1, 5);
		range.forEach(System.out::println);
		// rangeclosed to include second value or long also
		System.err.println("----------------");
		IntStream rangeClosed = IntStream.rangeClosed(1, 6);
		rangeClosed.forEach(System.out::println);

		// stream of doubles
		System.out.println("---------------");
		// new random
		Random random = new Random();
		DoubleStream doubles = random.doubles(5);
		doubles.forEach(System.out::println);

		System.out.println("-------------");
		// convert a string into a integer stream
		IntStream chars = "abcd".chars();
		chars.forEach(System.out::println);

	}

}
