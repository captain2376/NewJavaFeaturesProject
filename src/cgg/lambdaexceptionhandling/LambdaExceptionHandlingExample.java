package cgg.lambdaexceptionhandling;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExceptionHandlingExample {

	public static void main(String[] args) {
		

//		List<Integer> integers=Arrays.asList(1,2,3,4,5,6,9);
		List<Integer> integers = Arrays.asList(0, 2, 3, 4, 5, 6, 9);
		/*
		 * integers.forEach(i -> { try { System.out.println(50 / i); } catch (Exception
		 * e) { System.out.println("Arithmatic exception occured" + e.getMessage());
		 * 
		 * } });
		 */
		integers.forEach(lambdaWrapper(i->System.out.println(50/i),Exception.class));

	}
//generalised lambda
	private static <T,E extends Exception> Consumer<T> lambdaWrapper(Consumer<T> consumer,Class<E> c) {
		return i -> {
			try {
				consumer.accept(i);
			} catch (Exception e) {
				System.out.println("Arithmatic exception occured" + e.getMessage());
			}
		};

	}
}
