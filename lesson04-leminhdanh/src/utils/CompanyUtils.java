package utils;

import bean.DepartmentHead;
import bean.Director;
import bean.Information;
import bean.Staff;

public class CompanyUtils {
	public static void SalaryCalculation(Information[] humans) {
		System.out.printf("%-30s %-30s \n", "Họ và Tên", "Lương");
		System.out.println("===============================================");
		for(Information human:humans) {
		double salary = 0;
		if (human instanceof Director) {
			salary = (human.getSalary() + human.getTitleLevel()) * 3000000;
		} else if (human instanceof DepartmentHead) {
			salary = (human.getSalary() + human.getTitleLevel()) * 2200000;
		} else {
			salary = human.getSalary() * 1250000;
		}
		System.out.printf("%-30s %-30.2f \n", human.getName(), salary);
		}
	}

	public static void export(Information... positions) {
		System.out.printf("%-30s %-30s %-30s\n", "Tên", "Ngày sinh", "chức vụ");
		System.out.println("==========================================================================");
		for (Information position : positions) {
			if (position.getDepartment() == null) {
				System.out.printf("%-30s %-30s %-30s\n", position.getName(), position.getBith(), "giám đốc");
			} else if (position.getTitleLevel() == null) {
				System.out.printf("%-30s %-30s %-30s\n", position.getName(), position.getBith(), "nhân viên");
			}else {
				System.out.printf("%-30s %-30s %-30s\n", position.getName(), position.getBith(), "trưởng phòng");
			}
		}
	}

	public static void countTheNumberOfEmployees(DepartmentHead[] departmentHeads, Staff[] staffs) {
		System.out.printf("%-30s %-30s \n", "Tên Trưởng phòng", "số thành viên quản lí");
		System.out.println("=========================================================");
		for(DepartmentHead departmentHead:departmentHeads) {
			int count = 0;
			for(Staff staff:staffs) {
				if(staff.getDepartment()==departmentHead.getDepartment()) {
					count++;
				}
			}
			System.out.printf("%-30s %-30s \n", departmentHead.getName(), count);
		}
	}
}
