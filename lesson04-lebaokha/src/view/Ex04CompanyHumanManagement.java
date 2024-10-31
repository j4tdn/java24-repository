package view;

import bean.Human;
import bean.Manager;
import bean.President;
import bean.Staff;

public class Ex04CompanyHumanManagement {

	public static void main(String[] args) {
		President p1 = new President("Lê Bảo Kha", "22.04.2001", 1.5d, 2.5d);

		Manager m1 = new Manager("Lê Văn Tèo", "22.05.2003", 1.0d, 2.0d, "Phòng kinh doanh");
		Manager m2 = new Manager("Nguyễn Thị Thập", "12.05.2002", 1.0d, 1.0d, "Phòng nhân sự");

		Staff s1 = new Staff("Lê Văn Tú", "10.11.2002", 0.5d, "Phòng kinh doanh", "Lê Văn Tèo");
		Staff s2 = new Staff("Lê Văn Tám", "20.01.2002", 0.5d, "Phòng kinh doanh", "Lê Văn Tèo");
		Staff s3 = new Staff("Lê Văn Bảy", "18.03.2003", 0.5d, "Phòng kinh doanh", "Lê Văn Tèo");

		Staff s4 = new Staff("Lê Thị Tú", "09.11.2002", 0.5d, "Phòng nhân sự", "Nguyễn Thị Thập");
		Staff s5 = new Staff("Nguyễn Thị Bé", "07.04.2004", 0.5d, "Phòng nhân sự", "Nguyễn Thị Thập");
		Staff s6 = new Staff("Bùi Thị Xuân", "20.12.2003", 0.5d, "Phòng nhân sự", "Nguyễn Thị Thập");

		Human[] humans = { p1, m1, m2, s1, s2, s3, s4, s5, s6 };
		Manager[] managers = { m1, m2 };
		Staff[] staffs = { s1, s2, s3, s4, s5, s6 };

		System.out.println("Thông tin nhân sự");

		for (Human human : humans) {
			System.out.println(human);
		}

		System.out.println("================================================");
		System.out.println("Thông tin số lượng nhân viên theo trưởng phòng");

		int count1 = 0;
		int count2 = 0;

		for (Staff staff : staffs) {
			switch (staff.getNameManager()) {
			case "Lê Văn Tèo":
				count1++;
				break;
			case "Nguyễn Thị Thập":
				count2++;
				break;
			}
		}

		System.out.println("Số lượng nhân viên theo trưởng phòng Lê Văn Tèo là " + count1);
		System.out.println("Số lượng nhân viên theo trưởng phòng Nguyễn Thị Thập là " + count2);

		System.out.println("================================================");
		System.out.println("Thông tin lương");
		System.out.println("Lương giám đốc --> " + p1.salaryP());
		for (Manager manager : managers) {
			System.out.println("Lương trưởng phòng " + manager.getName() + " --> " + manager.salaryM());
		}

		for (Staff staff : staffs) {
			System.out.println("Lương nhân viên " + staff.getName() + " --> " + staff.salaryS());
		}

	}
}
