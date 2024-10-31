package utils;

import bean.Student;

public class FindPointStudent {

	public static void findAvgPoint(Student[] students, float point) {
		System.out.println("Sinh viên có điểm trung bình từ " + point + " trở lên");
		boolean test = false;

		for (Student student : students) {
			if (student.averagePoint() > point) {
				System.out.println(student.getNameStudent());
				test = true;
			}
		}
		if (!test) {
			System.out.println("Không có");
		}
	}

	public static void findPoint(Student[] students) {
		System.out.println("Sinh viên có điểm lý thuyết lớn hơn điểm thực hành");
		boolean test = false;
		for (Student student : students) {
			if (student.getTheoryPoint() > student.getPracticePoint()) {
				System.out.println(student.getNameStudent());
				test = true;
			}
		}
		if (!test) {
			System.out.println("Không có");
		}

	}

}
