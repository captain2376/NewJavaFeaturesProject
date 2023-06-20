package cgg.streamsoperations;

import java.util.ArrayList;

public class MatchingFunctions {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();

		list.add(new Student("Sindhu", 22));
		list.add(new Student("Vardhan", 20));
		list.add(new Student("Arjun", 20));
		list.add(new Student("Nithin", 19));
		
		boolean allMatch = list.stream().allMatch(s->s.getName().contains("n"));
		System.out.println(allMatch);
		System.out.println("--------------------");
		boolean anyMatch = list.stream().anyMatch(s->s.getAge()>20);
		System.out.println(anyMatch);
		System.out.println("--------------------");
		boolean noneMatch = list.stream().noneMatch(s->s.getAge()>25);
		System.out.println(noneMatch);
	}

}
