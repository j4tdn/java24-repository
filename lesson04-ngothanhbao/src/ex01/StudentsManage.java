package ex01;

import java.util.Scanner;

import bean.Students;

public class StudentsManage {
	
	public static void main(String[] args) {
		Students[] student = studentData();
		findStudentAvg(student);
		theoryOverPractice(student);
		
	}
	
	private static void inputInfo(Students student) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap ma sinh vien: ");
		student.setStudentID(Integer.parseInt(ip.nextLine()));
		System.out.print("Nhap ten sinh vien: ");
		student.setName(ip.nextLine());
		System.out.print("Nhap diem ly thuyet: ");
		student.setTheoryScore(Double.parseDouble(ip.nextLine()));
		System.out.print("Nhap diem thuc hanh: ");
		student.setPracticeScore(Double.parseDouble(ip.nextLine()));
		System.out.println("sv ----> " +  student);
		ip.close();
	}
	
	private static Students[] studentData() {
		Students sv1 = new Students(282, "Anh", 8d, 9d);
		Students sv2 = new Students(385, "Bao", 7d, 8d);
		Students sv3 = new Students();
		inputInfo(sv3);
		return new Students[] {sv1,sv2,sv3};
	}
	
	private static void findStudentAvg(Students[] students) {
		for(Students student : students) {
			if(student.AvarageScore() > 8.5) {
				System.out.println("Sinh vien co DTB lon hon 8.5 la: " + student);
			}
		}
	}
	
	private static void theoryOverPractice(Students[] students) {
		for(Students student : students) {
			if(student.getTheoryScore() > student.getPracticeScore()) {
				System.out.println("Sinh vien co diem LT lon hon diem TH la: " + student);
			}
		}
	}
	
}
