package utils;

import java.util.Scanner;

import bean.Students;

public class StudentsInput {

	public static Students sI() {
		Scanner ip = new Scanner(System.in);
		Students student = new Students();
		System.out.print("Nhập ID sinh viên: ");
		student.setId(ip.nextInt());
		ip.nextLine();

		System.out.print("Nhập họ tên sinh viên: ");
		student.setName(ip.nextLine());

		System.out.print("Nhập điểm lý thuyết sinh viên: ");
		student.setTheoryPoint(ip.nextDouble());

		System.out.print("Nhập điểm thực hành sinh viên: ");
		student.setPracticePoint(ip.nextDouble());
		return student;
	}
}
