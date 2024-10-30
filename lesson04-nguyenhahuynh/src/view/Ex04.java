package view;

import java.util.ArrayList;
import java.util.List;

import bean.Director;
import bean.Manager;
import bean.Staff;

public class Ex04 {

	public static void main(String[] args) {
        Director director = new Director("Nguyễn Hà Huynh", "12/02", 5.0, 1.5);
        Manager manager1 = new Manager("Nguyễn Thanh Tùng", "25/10", 4.0, 1.2, "Phòng Kế toán");
        Manager manager2 = new Manager("Trịnh Trần Phương Tuấn", "19/4", 4.0, 1.3, "Phòng Nhân sự");

        Staff staff1 = new Staff("Trần Minh Anh", "12/12", 2.70, "Phòng Kế toán", manager1);
        Staff staff2 = new Staff("Nguyễn Hoàng Bảo", "19/11", 1.0, "Phòng Kế toán", manager1);
        Staff staff3 = new Staff("Lê Ngọc Dung", "28/10", 1.5, "Phòng Kế toán", manager1);
        Staff staff4 = new Staff("Hoàng Phương Linh", "1/1", 2.5, "Phòng Nhân sự", manager2);
        Staff staff5 = new Staff("Vũ Thị Thanh", "24/4", 3.5, "Phòng Nhân sự", manager2);
        Staff staff6 = new Staff("Trịnh Ngọc Yến", "20/11", 2.2, "Phòng Nhân sự", manager2);
        

        List<Object> employees = new ArrayList<>();
        employees.add(director);
        employees.add(manager1);
        employees.add(manager2);
        employees.add(staff1);
        employees.add(staff2);
        employees.add(staff3);
        employees.add(staff4);
        employees.add(staff5);
        employees.add(staff6);

//        System.out.println("Danh sách nhân sự:");
//        for (Object employee : employees) {
//            System.out.println(employee);
//        }
        for (Object employee : employees) {
            double salary = 0;

            if (employee instanceof Director) {
                Director dir = (Director) employee;
                salary = (dir.getSalary() + dir.getPositionFactor()) * 3000000;
            } else if (employee instanceof Manager) {
                Manager mgr = (Manager) employee;
                salary = (mgr.getSalary() + mgr.getPositionFactor()) * 2200000;
            } else if (employee instanceof Staff) {
                Staff staff = (Staff) employee;
                salary = staff.getSalary() * 1250000;
             }

            System.out.println(employee + " - Lương: " + salary);
        }
	}
}
