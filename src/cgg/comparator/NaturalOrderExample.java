package cgg.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NaturalOrderExample {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Vasu",22));
		empList.add(new Employee("Brinda",22));
		empList.add(new Employee("Jay",22));
		empList.add(new Employee("Hari",22));
		empList.add(new Employee("Krishna",22));
		empList.add(new Employee("Andhak",22));
		
		List<String> nameList = empList.stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println("Before sorting");
		nameList.forEach(System.out::println);
		
		
		//nameList.sort(Comparator.naturalOrder());
		
		//reverse order
		nameList.sort(Comparator.reverseOrder());
		System.out.println("--------------------------");
		nameList.forEach(System.out::println);
	}

}
