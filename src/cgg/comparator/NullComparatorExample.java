package cgg.comparator;


import java.util.ArrayList;
import java.util.Comparator;

public class NullComparatorExample {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Vasu", 26));
		empList.add(new Employee("Brinda", 21));
		empList.add(new Employee("", 32));
		empList.add(new Employee("Jay", 24));
		empList.add(new Employee("Hari", 22));
		empList.add(new Employee("", 52));
		empList.add(new Employee("Krishna", 23));
		empList.add(new Employee("Andhak", 24));
		System.out.println("-----befor sorting ----"+"\n");
		empList.forEach(System.out::println);
		
		//here we are using nulls first comparator
		//Comparator<Employee> comparing = Comparator.comparing(Employee::getName,Comparator.nullsFirst(String::compareTo));
		
		Comparator<Employee> comparator = Comparator.comparing(Employee::getName,Comparator.nullsLast(String::compareTo));
		
		//Collections.sort(empList,comparing);
		empList.sort(comparator);
		System.out.println("-----after sorting ----"+"\n");
		empList.forEach(System.out::println);
		
	}

}
