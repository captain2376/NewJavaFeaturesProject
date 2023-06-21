package cgg.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorComparingExample {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("dasu", 22));
		empList.add(new Employee("Brinda", 22));
		empList.add(new Employee("Jay", 22));
		empList.add(new Employee("Hari", 22));
		empList.add(new Employee("Krishna", 22));
		empList.add(new Employee("Andhak", 22));
		System.out.println("-----befor sorting ----" + "\n");
		
		empList.forEach(System.out::println);
		
		System.out.println("------------");
		//Comparator<Employee> comp = Comparator.comparing(Employee::getName);
		
		Comparator<Employee> comp = Comparator.comparing(Employee::getName, String.CASE_INSENSITIVE_ORDER);
				
		//comparator has a static method comparing 
		//we can use empList.sort also
		
		Collections.sort(empList,comp);
		
		System.out.println("-----after sorting ----" + "\n");
		
		empList.forEach(System.out::println);
	}

}
