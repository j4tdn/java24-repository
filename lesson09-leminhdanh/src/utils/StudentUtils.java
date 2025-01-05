package utils;

import bean.Student;

public class StudentUtils {
	public static void sortA(Student[] students) {
		System.out.println("Nhung sinh vien doat loai A: ");

		for (Student student : students) {
			if (student.getSort() == "A") {
				System.out.println("Mssv: " + student.getMssv() + "\t" + student.getName());
			}
		}
	}

	public static void dupctdl(Student[] students) {
		System.out.println("Nhung sinh vien hoc lai: ");

		for (Student student1:students) {
			int n=0;
			for(Student student2:students) {
				if(student1.getMssv()==student2.getMssv()) {
					n++;
				}
				if(n==2) {
					System.out.println("Mssv: " + student1.getMssv() + "\t" + student1.getName() + "\t" + student1.getSort());
					break;
				}
			}
		}
	}
}
