package utils;

import bean.Student;

public class StudentUtils {
	public static void findAvgScore(Student[] students) {
		System.out.println("thông tin các sinh vien lơn hơn 8.5");
		for (Student student : students) {
			if(student.avg() > 8.5) {
				System.out.println(student);
			}
		}
	}
	public static void findPracticeScore(Student[] students) {
		System.out.println("thông tin các sinh vien có điểm lý thuyết lớn hơn điểm thực hành");
		for (Student student : students) {
			if(student.getTheoreticalPoint() > student.getPracticePoint()) {
				System.out.println(student);
			}
		}
	}
}
