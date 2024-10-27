package ex04_human_resource_management;

import java.time.LocalDate;

import bean.BaseEmployee;
import bean.Director;
import bean.Employee;
import bean.Manager;

public class Ex04 {
	
	private static BaseEmployee[] emps;
	
	public static void main(String[] args) {
		initialData();
		
		System.out.println("===== Information about personnel in the company =====");
		informHumanResoures(1);
		
		System.out.println("\n===== Statistics amount of employees managed by each Manager =====");
		groupEmployeesManageByManager();
		
		System.out.println("\n===== The salary of each type of human resource =====");
		informHumanResoures(2);
	}
	
	private static void initialData() {
		Director dir = new Director("Nguyễn Văn A", LocalDate.of(1970, 1, 15), 3.5, 1.8);

		Manager mng1 = new Manager("Trần Thị B", LocalDate.of(1980, 6, 20), 2.8, 2, "Kinh doanh");
		Manager mng2 = new Manager("Lê Văn C", LocalDate.of(1985, 9, 10), 3.2, 2.1, "Marketing");

		Employee emp1 = new Employee("Phạm Văn D", LocalDate.of(1990, 4, 25), 1.5, "Kinh doanh", mng1);
		Employee emp2 = new Employee("Nguyễn Thị E", LocalDate.of(1992, 3, 14), 1.8, "Kinh doanh", mng1);
		Employee emp3 = new Employee("Đỗ Văn F", LocalDate.of(1993, 8, 19), 1.4, "Marketing", mng2);
		Employee emp4 = new Employee("Hoàng Thị G", LocalDate.of(1994, 7, 23), 1.2, "Marketing", mng2);
		Employee emp5 = new Employee("Vũ Thị H", LocalDate.of(1991, 12, 5), 1.6, "Kinh doanh", mng1);
		Employee emp6 = new Employee("Phan Văn I", LocalDate.of(1989, 11, 30), 1.1, "Marketing", mng2);
		
		emps = new BaseEmployee [] {dir, mng1, mng2, emp1, emp2, emp3, emp4, emp5, emp6};
	}
	
	private static void informHumanResoures(int choice) {
		System.out.println("Director:");
		for (BaseEmployee e : emps) {
			if (e instanceof Director && choice == 1){
				System.out.println(e);
			} else if (e instanceof Director && choice == 2) {
				System.out.println(e.getName() + " have salary " + e.salary());
			}
		}
		
		System.out.println("\nManager:");
		for (BaseEmployee e : emps) {
			if (e instanceof Manager && choice == 1){
				System.out.println(e);
			} else if (e instanceof Manager && choice == 2) {
				System.out.println(e.getName() + " have salary " + e.salary());
			}
		}
		
		System.out.println("\nEmployee:");
		for (BaseEmployee e : emps) {
			if (e instanceof Employee && choice == 1){
				System.out.println(e);
			} else if (e instanceof Employee && choice == 2) {
				System.out.println(e.getName() + " have salary " + e.salary());
			}
		}
	}
	
	private static void groupEmployeesManageByManager() {
		for (BaseEmployee mng : emps) {
			if (mng instanceof Manager) {
				System.out.println(mng.getName() + ":");
				for (BaseEmployee emp : emps) {
					if (emp instanceof Employee && ((Employee) emp).getManager().equals(mng)) {
						System.out.println(emp);
					}
				}
				System.out.println();
			}
		}
	}
	
	
}
