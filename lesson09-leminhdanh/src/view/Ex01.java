package view;

import bean.Student;
import utils.StudentUtils;

public class Ex01 {
	public static void main(String[] args) {
		Student[] students =
		{
		new Student("102", "Nam", "C"),
		new Student("103", "Bảo", "F"),
		new Student("104", "Hoàng", "D"),
		new Student("105", "Nguyên", "B"),
		new Student("107", "Vũ", "F"),
		new Student("109", "Lan", "A"),
		new Student("202", "Đạt", "C"),
		new Student("103", "Bảo", "F"),
		new Student("107", "Vũ", "C"),
		new Student("104", "Hoàng", "B")
		};
		
		StudentUtils.sortA(students);
		System.out.println("\n====================================\n");
		StudentUtils.dupctdl(students);
		
	}
	
	
}
