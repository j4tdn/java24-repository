package ex01;

import ex01.Grades.Grade;

public class Main {
	public static void main(String[] args) {
		
		Student[] students = {
				new Student(102, "Nam", Grades.Grade.C),
				new Student(103, "Bảo", Grades.Grade.F),
				new Student(104, "Hoàng", Grades.Grade.D),
				new Student(105, "Nguyên", Grades.Grade.B),
				new Student(107, "Vũ", Grades.Grade.F),
				new Student(109, "Lan", Grades.Grade.A),
				new Student(202, "Đạt", Grades.Grade.C),
				new Student(103, "Bảo", Grades.Grade.F),
				new Student(107, "Vũ", Grades.Grade.C),
				new Student(104, "Hoàng", Grades.Grade.B),
		};
		
		System.out.println("\nDanh sách sinh viên được điểm A: ");
		for (Student student : students) {
			if (student.getGrade() == Grade.A) {
				System.out.println("Mã sinh viên: " + student.getId() + ", Tên: " + student.getName());
			}
		}
		
		System.out.println("\nDanh sách sinh viên được điểm F và phải đăng ký học lại: ");
		for (Student student : students) {
			if (student.getGrade() == Grade.F) {
				System.out.println("Mã sinh viên: " + student.getId() + ", Tên: " + student.getName());
			}
		}
	}

}
