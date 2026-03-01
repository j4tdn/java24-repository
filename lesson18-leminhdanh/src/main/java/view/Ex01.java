package view;

import service.StudentService;
import service.StudentServiceImpl;

public class Ex01 {

	private static StudentService studentService;
	
	static {
		studentService = new StudentServiceImpl();
	}
	
	public static void main(String[] args) {
		var st1 = studentService.get(1);
		
		st1.forEach(System.out::println);
	}
}
