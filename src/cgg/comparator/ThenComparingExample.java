package cgg.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ThenComparingExample {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Vasu", 22));
		empList.add(new Employee("Brinda", 40));
		empList.add(new Employee("Jay", 32));
		empList.add(new Employee("Hari", 42));
		empList.add(new Employee("Jay", 35));
		empList.add(new Employee("Jay", 23));
		System.out.println("-----befor sorting ----"+"\n");
		empList.forEach(System.out::println);
		
		System.out.println("--------------");
		
		Comparator<Employee> thenComparing = Comparator.comparing(Employee::getName).thenComparing(Employee::getAge);
		//empList.sort(thenComparing); or we can use collections.sort(list,comparator);
		Collections.sort(empList,thenComparing);
		System.out.println("After sorting");
		empList.forEach(System.out::println);

	}

}
