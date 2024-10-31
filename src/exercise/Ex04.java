package exercise;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bean.Director;
import bean.Manager;
import bean.Staff;

public class Ex04 {
	private static Director d;
	private static List<Manager> managerList = new ArrayList<>();
	private static List<Staff> staffList = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		createData();
		displayAllInfoStaff();
		System.out.println("---------------------");
		countStaff();
		System.out.println("---------------------");
		calSalaryEachStaff();
		
	}
	
	
	public static void createData() {
		d = new Director("Nguyễn Văn A", LocalDate.parse("2000-01-01"), 5, 2);
		
		Manager m1 = new Manager("Trần Thị B", LocalDate.parse("2005-02-02"), 4, 1, "Marketing Department");
		Manager m2 = new Manager("Trần Thị C", LocalDate.parse("2005-03-03"), 4, 1, "IT Department");
		managerList.add(m1);
		managerList.add(m2);
		
		staffList.add(new Staff("Hoàng văn D", LocalDate.parse("2010-04-04"), 2, "Marketing Department", m1));
		staffList.add(new Staff("Hoàng văn E", LocalDate.parse("2010-05-05"), 2, "Marketing Department", m1));
		staffList.add(new Staff("Hoàng văn F", LocalDate.parse("2010-06-06"), 2, "Marketing Department", m1));
		staffList.add(new Staff("Hoàng văn G", LocalDate.parse("2010-07-07"), 2, "Marketing Department", m2));
		staffList.add(new Staff("Hoàng văn H", LocalDate.parse("2010-08-08"), 2, "Marketing Department", m2));
		staffList.add(new Staff("Hoàng văn I", LocalDate.parse("2010-09-09"), 2, "Marketing Department", m2));
	}
	
	
	public static void displayAllInfoStaff() {
		System.out.println("Director: \n" + d.displayInfo());
		System.out.println("Manager: ");
		for(Manager manager: managerList) {
			System.out.println(manager.displayInfo());
		}
		System.out.println("Staff: ");
		for(Staff staff: staffList) {
			System.out.println(staff.displayInfo());
		}
	}
	
	
	public static void countStaff() {
		for(Manager manager: managerList) {
			int count = 0;
			
			System.out.println(manager.getName() + " manages: ");
			for(Staff staff: staffList) {
				if (staff.getManager().equals(manager)) {
					count++;
					System.out.println(staff.getName());
				}
			}
			System.out.println("Total: " + count + " people");
		}
	}
	
	
	public static void calSalaryEachStaff() {
		System.out.println("Director " + d.getName() + ": " + d.calSalary());
		
		for(Manager manager: managerList) {
			System.out.println(manager.getName() + ": " + manager.calSalary());
		}
		
		for(Staff staff: staffList) {
			System.out.println(staff.getName() + ": " + staff.calSalary());
		}
	}
	
}

