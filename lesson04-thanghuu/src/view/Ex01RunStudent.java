package view;

import java.util.Scanner;

import bean.Student;

public class Ex01RunStudent {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		Student sv1 = new Student(001, "HuuThang", 9d, 9d);
		Student sv2 = new Student(002, "HoangAnh", 9d, 9d);
		
		Student sv3 = new Student();
		System.out.println("Nhap ID sinh vien:");
		sv3.setIdStudent(Integer.parseInt(ip.nextLine()));
		System.out.println("Nhap Name sinh vien:");
		sv3.setNameStudent(ip.nextLine());
		System.out.println("Nhap theory point sinh vien:");
		sv3.setTheoryPoint(Double.parseDouble(ip.nextLine()));
		System.out.println("Nhap laborate point sinh vien:");
		sv3.setLabPoint(Double.parseDouble(ip.nextLine()));
		
		Student[] students = new Student[] {sv1, sv2, sv3};
		
		theoryGreaterThan85(students);
		
		theoryGreaterThanLab(students);
		
		ip.close();
	}
	
	private static void theoryGreaterThan85(Student[] students) {
		System.out.println("Sinh viên có điểm lý thuyết hơn 8.5 :");
		for(Student std : students) {
			if(std.averagePoint() > 8.5) {
				System.out.println(std);
			}
		}
	}
	
	private static void theoryGreaterThanLab(Student[] students) {
		System.out.println("Sinh viên có điểm lý thuyết hơn thực hành :");
		for(Student std : students) {
			if(std.getTheoryPoint() > std.getLabPoint()) {
				System.out.println(std);
			}
		}
	}
	
	
	
	
}
