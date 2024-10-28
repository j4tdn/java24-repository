package view;

import java.time.LocalDate;

import bean.BaseEmployee;
import bean.Director;
import bean.Employee;
import bean.Manager;
import utils.ManagementUltis;

public class Ex04 {
	public static void main(String[] args) {
		Director d = new Director("Tran Anh Vu", LocalDate.of(2003, 02, 27), 2.4, 7);

		Manager m1 = new Manager("Tran A", LocalDate.of(2003, 02, 27), 2.1, 6, "marketing");
		Manager m2 = new Manager("Tran B", LocalDate.of(2003, 02, 26), 2.4, 6, "production");

		Employee e1 = new Employee("Tran C", LocalDate.of(2003, 02, 25), 4.2, "marketing", m1);
		Employee e2 = new Employee("Tran D", LocalDate.of(2002, 02, 24), 2.5, "production", m2);
		Employee e3 = new Employee("Tran E", LocalDate.of(2001, 02, 23), 1.8, "marketing", m1);
		Employee e4 = new Employee("Tran F", LocalDate.of(1999, 02, 22), 3.2, "production", m2);
		Employee e5 = new Employee("Tran G", LocalDate.of(1998, 02, 21), 5.4, "production", m1);
		Employee e6 = new Employee("Tran H", LocalDate.of(1997, 02, 20), 2, "marketing", m1);

		BaseEmployee[] be = new BaseEmployee[] { d, m1, m2, e1, e2, e3, e4, e5, e6 };
		ManagementUltis.export(be);
		Employee[] e = new Employee[] { e1, e2, e3, e4, e5, e6 };
		Manager[] m = new Manager[] { m1, m2 };
		ManagementUltis.getTotalEmloyeesManaged(m, e);
	}
}
