package view;

import java.time.LocalDate;

import bean.Director;
import bean.Employee;
import bean.HeadOfDepartment;
import bean.Human;
import utils.Management;

public class Ex04StaffManager {

	public static void main(String[] args) {

		Director d1 = new Director("Nguyen Van A", LocalDate.of(1985, 5, 26), 3.5d, 6d);
		HeadOfDepartment h1 = new HeadOfDepartment("Nguyen C", LocalDate.of(1995, 2, 11), 2.5d, 4d, "HK");
		HeadOfDepartment h2 = new HeadOfDepartment("Le Vi", LocalDate.of(1997, 2, 10), 2.5d, 4d, "SC");
		Employee e1 = new Employee("Mai Van A", LocalDate.of(2000, 1, 12), 1.5d, "HK", h1);
		Employee e2 = new Employee("Tran La Luot", LocalDate.of(2001, 4, 3), 1.5d, "HK", h1);
		Employee e3 = new Employee("Nguyen Bang Qua", LocalDate.of(2003, 3, 1), 1.5d, "HK", h1);
		Employee e4 = new Employee("Rocky CDE", LocalDate.of(2003, 2, 11), 1.6d, "SC", h2);
		Employee e5 = new Employee("Hustlang Robber", LocalDate.of(1996, 7, 11), 1.6d, "SC", h2);
		Employee e6 = new Employee("Vsoul", LocalDate.of(1999, 10, 10), 1.6d, "SC", h2);
		Human[] human = { d1, h1, h2, e1, e2, e3, e4, e5, e6 };
		Human[] level = { d1, h1, e1 };
		Employee[] employee = { e1, e2, e3, e4, e5, e6 };

		Management.dispayStaff(human);
		Management.displaySalary(level);
		Management.displayEmployee(employee);

	}
}
