package view;

import java.time.LocalDate;

import bean.CEO;
import bean.Human;
import bean.Manager;
import bean.Staff;

public class Ex04HRManagement {

	public static void main(String[] args) {
		Human ceo1 = new CEO("Quyền", LocalDate.of(1990, 4, 20), 5.0d, 2.0d);

		Human manager1 = new Manager("Thái", LocalDate.of(1995, 5, 21), 3.0d, 1.5d, "Hành chính");
		Human manager2 = new Manager("Dũng", LocalDate.of(1997, 6, 01), 2.0d, 2.5d, "Marketing");

		Human staff1 = new Staff("Lan", LocalDate.of(2000, 5, 15), 1.5d, "Hành chính", manager1);
		Human staff2 = new Staff("Hùng", LocalDate.of(2001, 6, 15), 1.5d, "Hành chính", manager1);
		Human staff3 = new Staff("Đào", LocalDate.of(1999, 7, 20), 2.5d, "Hành chính", manager1);
		Human staff4 = new Staff("Mai", LocalDate.of(2002, 12, 22), 1.5d, "Marketing", manager2);
		Human staff5 = new Staff("Tuấn", LocalDate.of(2003, 7, 12), 3.5d, "Hành chính", manager1);
		Human staff6 = new Staff("Mạnh", LocalDate.of(2004, 8, 11), 2.5d, "Marketing", manager2);

		Human[] company = { ceo1, manager1, manager2, staff1, staff2, staff3, staff4, staff5, staff6 };

		showInformation(company);
		System.out.println("===================================");
		count(company, manager1, manager2);
		System.out.println("===================================");
		showSalary(company);
	}

	public static void showInformation(Human[] humans) {

		System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "Chức vụ", "Họ tên", "Ngày sinh", "Hệ số lương",
				"Hệ số chức vụ", "Tên đơn vị", "Trưởng phòng");

		for (Human human : humans) {

			human.printInfo();

		}
	}

	public static void count(Human[] humans, Human manager1, Human manager2) {
		int m1 = 0;
		int m2 = 0;

		for (Human human : humans) {
			if (human instanceof Staff) {
				if (((Staff) human).getManager().equals(manager1)) {
					m1++;
				} else {
					m2++;
				}

			}

		}

		System.out.println("Số lượng nhân viên quản lí của " + manager1.getName() + " là: " + m1);
		System.out.println("Số lượng nhân viên quản lí của " + manager2.getName() + " là: " + m2);

	}

	public static void showSalary(Human[] humans) {
		System.out.printf("%-20s %-20s\n","Họ tên","Lương");
		for (Human human : humans) {
			human.salary();
		}
	}

}
