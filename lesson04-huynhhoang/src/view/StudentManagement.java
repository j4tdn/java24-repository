package view;

import java.util.Scanner;

import bean.Student;
import utils.StudentUtils;

public class StudentManagement {
	public static void main(String[] args) {
		Student sv1 = new Student(1, "hoang", 8.5, 9.0);

		Student sv2 = new Student(2, "quynh", 7.5, 6.5);
		Student sv3 = new Student();

		Scanner ip = new Scanner(System.in);

		System.out.println("Nhập mã sinh viên ");
		int studentId = Integer.parseInt(ip.nextLine());

		System.out.println("Nhập họ và tên ");
		String studentName = ip.nextLine();

		System.out.println("Nhập điểm lý thuyết  ");
		double theoreticalPoint = Double.parseDouble(ip.nextLine());

		System.out.println("Nhập điểm thực hành  ");
		double practicePoint = Double.parseDouble(ip.nextLine());

		sv3.setStudentId(studentId);
		sv3.setStudentName(studentName);
		sv3.setTheoreticalPoint(theoreticalPoint);
		sv3.setPracticePoint(practicePoint);

		Student[] students = { sv1, sv2, sv3 };

		StudentUtils.findAvgScore(students);
		StudentUtils.findPracticeScore(students);
		ip.close();

	}

}
