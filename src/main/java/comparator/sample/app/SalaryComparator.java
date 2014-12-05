package comparator.sample.app;

import java.util.Comparator;

import sample.common.Employee;

/**
 * Salary Comparator
 * 
 * @author malalanayake
 *
 */
public class SalaryComparator implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		if (o1.getSalary() > o2.getSalary()) {
			return 1;
		}

		if (o1.getSalary() < o2.getSalary()) {
			return -1;
		}
		return 0;
	}

}
