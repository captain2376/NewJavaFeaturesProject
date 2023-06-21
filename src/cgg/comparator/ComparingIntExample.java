package cgg.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparingIntExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Harini","Vrinda","Sri","Vasna","Jaganathan","ScotBorris");
		System.out.println("Before Sorting");
		list.forEach(System.out::println);
		
		Comparator<String> comparingInt = Comparator.comparingInt(String::length);
		System.out.println("_----------------");
		Collections.sort(list,comparingInt);
		System.out.println("Afer Sorting");
		list.forEach(System.out::println);
	}

}
