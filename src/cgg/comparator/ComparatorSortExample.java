package cgg.comparator;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorSortExample {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Vasu", 22));
		empList.add(new Employee("Brinda", 22));
		empList.add(new Employee("Jay", 32));
		empList.add(new Employee("Hari", 32));
		empList.add(new Employee("Krishna", 42));
		empList.add(new Employee("Andhak", 23));
		empList.add(new Employee("Jay", 25));
		empList.add(new Employee("Hari", 25));
		empList.add(new Employee("Krishna", 32));


		System.out.println("Before sorting:...........	");

		for (Employee employee : empList) {
			System.out.println(employee);
		}
		//alphabetical sort
		//empList.sort(Comparator.comparing(Employee::getName));
		Comparator<Employee> comp = Comparator.comparing(Employee::getName);
		
		empList.sort(comp.reversed());
		//reverse method imposes reverse order of comparator
		//for reverse order sort
		System.out.println("----------------------------");
		empList.forEach(System.out::println);
		
	}

}
