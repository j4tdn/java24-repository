package view;

import bean.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class Ex05SignUp {
	
	private static EmployeeService employeeService;
	
	static {
		employeeService = new EmployeeServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("------ Bắt đầu chương trình ------");
		System.out.println("------ Thực hiện đăng ký ------");
		employeeService.signup(new Employee("Nhân viên 12", "nv12@gmail.com", "nv12keys"));
		System.out.println("------ Kết thúc chương trình ------");
		
		
		// Đăng nhập --> password(text) --> convert to md5Text --> compare md5Text matches with any password in
		
	}
}
