package view;

import java.util.Iterator;

import bean.Student;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Student[] students = 
		{ 
		new Student(102, "Nam", 'C'), 
		new Student(103, "Bảo", 'F'),       
		new Student(104, "Hoàng", 'D'), 
		new Student(105, "Nguyên", 'B'), 
		new Student(107, "Vũ", 'F'), 
		new Student(109, "Lan", 'A'), 
		new Student(202, "Đạt", 'C'), 
		new Student(103, "Bảo", 'F'),  
		new Student(107, "Vũ", 'C'), 
		new Student(104, "Hoàng", 'B')
		};
		
		System.out.println("Học sinh đạt hạng A: ");
		for(Student student:students) {
			if(student.getRank() == 'A') {
				System.out.println(student);
			}
		} 
		
		System.out.println("Các học sinh học lại: ");

		for(Student student:students) {
			if(student.getRank() == 'F') {
				System.out.println(student);
			}
		}
		
		System.out.println("Các học sinh học lại 2 lần: ");
		
		

}
	
//	private static String getStudent(Student[] students) {
//		System.out.println("Các học sinh học lại: ");
//		for(Student student:students) {
//			if(student.getRank() == 'F') {
//				System.out.println(student);
//			}
//		}
//		
//		return 
//	}
	
}