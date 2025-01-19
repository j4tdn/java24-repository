package utils;

import bean.Student;

public class StudentUtils {
	// sort là sắp xếp :(, kết quả thì đúng nhưng tên hàm chưa đúng lắm Danh
	// Em làm thế này hiện tại kết quả đúng
	// Nhưng tổng quát ví dụ yêu cầu thay đổi hỏi tìm các học sinh xếp loại khác như D chẳng hạn
	// thì kết quả trả về có thể bị trùng
	// VD: Bạn Nam học môn này 2 lần và cả 2 lần đều bị D
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
				// Em có thể override hàm equals trong class Student rồi dùng hàm equals để so sánh
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
