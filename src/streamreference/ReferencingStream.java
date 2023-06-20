package streamreference;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReferencingStream {

	public static void main(String[] args) {
		/*
		 * Stream<String> stream = Stream.of("a","b","vsab").filter(e->e.contains(
		 * "d"));
		 * 
		 * Optional<String> findAny = stream.findAny(); //optional class is special
		 * class which stops from raising a null pointer exception
		 * System.out.println(findAny.get()); //another method find first
		 */
		List<String> collect = Stream.of("a", "b", "V").filter(e -> e.contains("b")).collect(Collectors.toList());
		Optional<String> findAny = collect.stream().findAny();
		System.out.println(findAny.get());

		Optional<String> findFirst = collect.stream().findFirst();
		System.out.println(findFirst);
	}

}
