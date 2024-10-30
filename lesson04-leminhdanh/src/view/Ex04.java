package view;

import java.time.LocalDate;

import bean.DepartmentHead;
import bean.Director;
import bean.Information;
import bean.Staff;
import utils.CompanyUtils;

public class Ex04 {
	public static void main(String[] args) {
		Information director = new Director("nguyen van A", LocalDate.of(1999, 12, 17), 10.5d, 0.6d);
		
		Information depHead1 = new DepartmentHead("Le Van Luyen", LocalDate.of(1982, 11, 5), 7.8d, 0.3d,"Sales ");
		Information depHead2 = new DepartmentHead("Le Minh Danh", LocalDate.of(1990, 8, 6), 8d, 0.3d," Accounting");
		
		Information staff1 = new Staff("Le Van Luyen", LocalDate.of(1989, 3, 5), 5d,"Sales ", (DepartmentHead)depHead1);
		Information staff2 = new Staff("nguyen hoang quy phuong", LocalDate.of(2003, 8, 6), 5.5d,"Sales ", (DepartmentHead)depHead1);
		Information staff3 = new Staff("tran van ot", LocalDate.of(2000, 6, 4), 6.2d,"Sales ", (DepartmentHead)depHead1);
		Information staff4 = new Staff("nguyen thi tham", LocalDate.of(2001, 2, 4), 5.1d,"Sales ", (DepartmentHead)depHead1);
		Information staff5 = new Staff("nguye dinh trong thua", LocalDate.of(1994, 8, 9), 6.1d,"Accounting", (DepartmentHead)depHead2);
		Information staff6 = new Staff("ro nanh do", LocalDate.of(2001, 7, 1), 5d,"Accounting", (DepartmentHead)depHead2);
		
		Information[] humans = new Information[] {director,depHead1,depHead2,staff1,staff2,staff3,staff4,staff5,staff6};
		
		CompanyUtils.export(humans);
		
		DepartmentHead[] depHeads = new DepartmentHead[] { (DepartmentHead)depHead1,(DepartmentHead)depHead2 };
		Staff[] staffs = new Staff[] {(Staff)staff1,(Staff)staff2,(Staff)staff3,(Staff)staff4,(Staff)staff5,(Staff)staff6};
		
		CompanyUtils.countTheNumberOfEmployees(depHeads, staffs);
		
		CompanyUtils.SalaryCalculation(humans);
	}
}
