package sample.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import comparator.sample.app.SalaryComparator;
import sample.common.Employee;

/**
 * 
 * @author malalanayake
 *
 */
public class App {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();

		Employee emp_dinuka = new Employee(101, "Dinuka", 27, 95000);
		employees.add(emp_dinuka);

		Employee emp_malalanayake = new Employee(100, "Malalanayake", 27, 85000);
		employees.add(emp_malalanayake);

		Employee emp_Thanuja = new Employee(305, "Thanuja", 23, 150000);
		employees.add(emp_Thanuja);

		Employee emp_Damith = new Employee(204, "Damith", 20, 75000);
		employees.add(emp_Damith);

		System.out.println("=======Before Sorting=====");
		for (Employee emp : employees) {
			System.out.println(emp.toString());
		}

		Collections.sort(employees);
		System.out.println("=======After Sorting=====");
		for (Employee emp : employees) {
			System.out.println(emp.toString());
		}
		
		SalaryComparator comparator = new SalaryComparator();
		Collections.sort(employees, comparator);
		System.out.println("=======After Sorting By Salary=====");
		for (Employee emp : employees) {
			System.out.println(emp.toString());
		}
	}
}
