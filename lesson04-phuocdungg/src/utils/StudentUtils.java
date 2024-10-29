package utils;

import bean.Student;

public class StudentUtils {

	// Hàm kiểm tra những sinh viên có điểm trung bình lớn hơn input
	public static void findAvgScore(Student[] students, Double score) {

		System.out.println("Những sinh viên có điểm trung bình lớn hơn " + score);
		for (Student student : students) {
			if (student.getAvgScore() > 8.5) {
				System.out.println(student);
			}
		}

	}

	// Hàm kiểm tra những sinh viên có điểm lý thuyết lớn hơn điểm thực hành
	public static void findPracticeScore(Student[] students) {
		System.out.println("Những sinh viên có điểm lý thuyết lớn hơn điểm thực hành");
		for (Student student : students) {
			if (student.getTheoreticalScore() > student.getPracticeScore()) {
				System.out.println(student);
			}
		}

	}

}
