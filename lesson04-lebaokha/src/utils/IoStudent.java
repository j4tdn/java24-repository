package utils;

import java.util.Scanner;

import bean.Student;

public class IoStudent {
	public static void enterInformation(Student st) {

		Scanner ip = new Scanner(System.in);

		System.out.println("Nhập mssv: ");
		st.setIdStudent(ip.nextLine());
		System.out.println("Nhập tên sinh viên: ");
		st.setNameStudent(ip.nextLine());
		System.out.println("Nhập điểm lý thuyết: ");
		st.setTheoryPoint(Float.parseFloat(ip.nextLine()));
		System.out.println("Nhập điểm thực hành: ");
		st.setPracticePoint(Float.parseFloat(ip.nextLine()));

		ip.close();
	}
}
