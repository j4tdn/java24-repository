package ex04;

import java.util.Scanner;

public class Main {
	public static void displayPeople(People...people) {
		System.out.println("Thông tin nhân viên ");
		for(People p : people) {
			System.out.print(p.toString());
			System.out.println("  Lương : "+p.payRoll());
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Manager newManager = new Manager("Nguyen Van A", "1975-01-01", 4.5);
		
		DepartmentManager DeMan1 = new DepartmentManager("Nguyen Van C","1975-01-01", 3.5,"Kinh doanh");
		DepartmentManager DeMan2 = new DepartmentManager("Nguyen Van D","1999-01-01", 3.5,"Nhân sự");
		
		
		Staff staff1 = new Staff("Nguyen Van D", "1990-03-20", 2.5, "Kinh doanh", "Nguyen Van C");
		Staff staff2 = new Staff("Tran Van E", "1991-07-22", 2.5, "Kinh doanh", "Nguyen Van C");
		Staff staff3 = new Staff("Pham Thi F", "1989-11-30", 2.5, "Kinh doanh", "Nguyen Van C");
		Staff staff4 = new Staff("Hoang Van G", "1992-02-11", 2.5, "Nhân sự", "Nguyen Van D");
		Staff staff5 = new Staff("Vu Thi H", "1993-04-09", 2.5, "Nhân sự", "Nguyen Van D");
		Staff staff6 = new Staff("Dang Van I", "1994-06-06", 2.5, "Nhân sự", "Nguyen Van D");
	   
		
		
		
//		Manager newManager = new Manager("Nguyen Van A", "1975-01-01", 4.5);
//		
//		DepartmentManager[] newDeMan = {
//				new DepartmentManager("Nguyen Van C","1975-01-01", 3.5,"Kinh doanh"),
//				new DepartmentManager("Nguyen Van D","1999-01-01", 3.5,"Nhân sự")
//	    };
//		
//		
//		Staff[] staffArray = {
//	            new Staff("Nguyen Van D", "1990-03-20", 2.5, "Kinh doanh", "Nguyen Van C"),
//	            new Staff("Tran Van E", "1991-07-22", 2.5, "Kinh doanh", "Nguyen Van C"),
//	            new Staff("Pham Thi F", "1989-11-30", 2.5, "Kinh doanh", "Nguyen Van C"),
//	            new Staff("Hoang Van G", "1992-02-11", 2.5, "Nhân sự", "Nguyen Van D"),
//	            new Staff("Vu Thi H", "1993-04-09", 2.5, "Nhân sự", "Nguyen Van D"),
//	            new Staff("Dang Van I", "1994-06-06", 2.5, "Nhân sự", "Nguyen Van D")
//	    };
		displayPeople(newManager,DeMan1,DeMan2,staff1,staff2,staff3,staff4,staff5,staff6);
	         
//		System.out.println("Thông tin Giám đốc:");
//	    System.out.println(newManager.toString());
//
//	    System.out.println("\nThông tin Trưởng phòng:");
//	    for (DepartmentManager departmentManager : newDeMan) {
//	        System.out.println(departmentManager.toString());
//	    } 
//
//	    System.out.println("\nThông tin Nhân viên:");
//	    for (Staff staff : staffArray) {
//	        System.out.println(staff.toString());
//	    } 

		
	}
}
