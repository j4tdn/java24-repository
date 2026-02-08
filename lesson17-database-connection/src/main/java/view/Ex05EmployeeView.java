package view;

import bean.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class Ex05EmployeeView {
	
	private static EmployeeService employeeService;
	
	static {
		employeeService = new EmployeeServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("---- Bắt đầu chương trình ----");
		
		System.out.println("... Thực hiện đăng ký ... ");
		
		employeeService.signup(new Employee("Nhân viên 13", "nv13@gmail.com", "nv13keys"));
		
		System.out.println("---- Kết thúc chương trình ----");
		
		// Đăng nhập --> password(text) --> convert to md5Text --> compare md5Text matches with any password in database
	}
	
}
