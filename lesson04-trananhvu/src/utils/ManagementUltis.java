package utils;

import bean.BaseEmployee;
import bean.Employee;
import bean.Manager;

public class ManagementUltis {
	private ManagementUltis() {
	}

	public static void getTotalEmloyeesManaged(Manager[] managers, Employee employees[]) {
		for (Manager manager : managers) {
			int count = 0;
			for (Employee employee : employees) {
				if (employee.getManager().equals(manager)) {
					count++;
				}
				manager.setTotalEmloyeesManaged(count);
			}
		}
		System.out.printf("\n\n%-20s %-20s\n", "Tên trưởng phòng", "Số lượng nhân viên quản lý");
		System.out.println("==========================================================");
		for (Manager manager : managers) {
			System.out.printf("%-20s %10s\n", manager.getName(), manager.getTotalEmloyeesManaged());
		}
	}

	public static void export(BaseEmployee[] baseEmployee) {
		System.out.printf("%-20s %-20s %10s %20s %20s\n", "Tên nhân viên", "Ngày sinh", "Hệ số lương", "Hệ số chức vụ",
				"Lương");
		System.out.println(
				"=================================================================================================");
		for (BaseEmployee be : baseEmployee) {
			System.out.printf("%-20s %-20s %10.1f %20.1f %20.2f\n", be.getName(), be.getBirthday(), be.getSalaryLevel(),
					be.getRegencyLevel(), be.getTotalSalary());
		}

	}
}
