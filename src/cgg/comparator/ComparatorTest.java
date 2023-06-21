package cgg.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTest {

	public static void main(String[] args) {
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Vasu",22));
		empList.add(new Employee("Brinda",22));
		empList.add(new Employee("Jay",22));
		empList.add(new Employee("Hari",22));
		empList.add(new Employee("Krishna",22));
		empList.add(new Employee("Andhak",22));
		
		System.out.println("Before sorting:...........	");
		
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		Collections.sort(empList,(e1,e2)->e1.getName().compareTo(e2.getName()));
		
		System.out.println("After soring :");
		for (Employee employee : empList) {
			System.out.println(employee);
		}
	}

}
