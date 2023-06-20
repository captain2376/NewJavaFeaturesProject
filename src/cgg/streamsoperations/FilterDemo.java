package cgg.streamsoperations;

import java.util.ArrayList;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("Sindhu",22));
		list.add( new Student("Vardhan",20));
		list.add( new Student("Arjun",20));
		list.add( new Student("Shri",19));
		Stream <Student> filteredList=list.stream().filter(e->e.getAge()>19);
		filteredList.forEach(System.out::println);
	}

}
