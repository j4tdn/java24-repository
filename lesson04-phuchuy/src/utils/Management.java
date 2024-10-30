package utils;

import bean.Employee;
import bean.Human;

public class Management {
	public static void dispayStaff(Human[] human) {

		System.out.printf("%-20s %-20s %-20s %-20s %-30s %-30s %n", "Họ tên", "Ngày sinh", "Chức vụ", "Hệ số lương",
				"Hệ số chức vụ (Nếu có)", "Tên đơn vị (Nếu có)");
		System.out.println(
				"==========================================================================================================================================");
		for (Human h : human) {
			System.out.printf("%-20s %-20s %-20s %-,20.1f %-,30.1f %-30s %n", h.getName(), h.getBirth(), h.getLevel(),
					h.getSalaryRanking(), h.getLevelRanking(), h.getDepartment());
		}
		System.out.println();
	}

	public static void displaySalary(Human[] human) {
		System.out.printf("%-20s %-20s %-30s %-30s %n", "Chức vụ", "Hệ số lương", "Hệ số chức vụ (Nếu có)",
				"Lương tổng");
		System.out
				.println("==========================================================================================");
		for (Human h : human) {
			System.out.printf("%-20s %-20.1f %-30.1f %-30.0f %n", h.getLevel(), h.getSalaryRanking(),
					h.getLevelRanking(), h.salaryCalc(h));
		}
		System.out.println();
	}

	public static void displayEmployee(Employee[] humans) {
		System.out.println("Danh sách nhân viên được quản lí bởi trưởng phòng: ");
		System.out.printf("%-20s %-20s %-20s %-20s %n", "Tên", "Ngày sinh", "Quản lý bởi", "Tên đơn vị");
		System.out.println("=========================================================================");
		for (Employee h : humans) {
			if (h.getDepartment().equals(h.getInfo().getDepartment())) {
				System.out.printf("%-20s %-20s %-20s %-20s %n", h.getName(), h.getBirth(), h.getInfo().getName(),
						h.getDepartment());
			}
		}
		System.out.println();
	}
}
