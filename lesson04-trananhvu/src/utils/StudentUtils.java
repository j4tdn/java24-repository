package utils;

import bean.Student;

public class StudentUtils {
	private StudentUtils() {
	}

	public static void getGoodStudents(Student[] student) {
		System.out.println("Sinh vien co diem trung binh lon hon 8.5:");
		for (Student sv : student) {
			if (sv.getAverageScore() > 8.5)
				System.out.println(sv.toString());
		}
	}

	public static void getSpecialStudents(Student[] student) {
		System.out.println("Sinh vien co diem ly thuyet lon hon diem thuc hanh:");
		for (Student sv : student) {
			if (sv.getTheoScore() > sv.getPracScore())
				System.out.println(sv.toString());
		}
	}

}
