package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionAndThenExample2 {

	public static void main(String[] args) {
		BiFunction<String, Integer, Integer> bifunction = (designation, age) -> getSalaryByAgeAndDesign(designation, age);

		int salary = bifunction.apply("Manager", 31);
		System.out.println(salary);

		salary = bifunction.apply("Developer", 28);
		System.out.println(salary);

		Function<Integer, String> function2 = sal ->getBandBasedOnSalary(sal);
		
		// Example of andThen method
		String salaryBand = bifunction.andThen(function2).apply("Manager", 31);
		System.out.println(salaryBand);
		
		String salaryBand2 = bifunction.andThen(function2).apply("Developer", 26);
		System.out.println(salaryBand2);
	}

	private static String getBandBasedOnSalary(Integer sal) {
		if (sal >= 100000) {
			return "Band 5";
		} else if (sal >= 80000) {
			return "Band 4";
		} else {
			return "Band 3";
		}
	}

	private static Integer getSalaryByAgeAndDesign(String designation, Integer age) {
		if (designation != null && age != null) {
			if (designation.equalsIgnoreCase("Manager") && age > 30) {
				return 120000;
			} else if (designation.equalsIgnoreCase("Developer") && age > 25) {
				return 90000;
			} else {
				return 0;
			}
		} else {
			return 0;
		}
	}

}
