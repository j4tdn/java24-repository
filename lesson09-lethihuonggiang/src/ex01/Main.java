package ex01;

import ex01.Grades.Grade;

public class Main {
	public static void main(String[] args) {
		
		// Em nên tách hàm ra để xử lý cho từng câu hi
		Student[] students = {
				new Student(102, "Nam", Grades.Grade.C),
				new Student(103, "Bảo", Grades.Grade.F),
				new Student(104, "Hoàng", Grades.Grade.D),
				new Student(105, "Nguyên", Grades.Grade.B),
				new Student(107, "Vũ", Grades.Grade.F),
				new Student(109, "Lan", Grades.Grade.A),
				new Student(202, "Đạt", Grades.Grade.C),
				new Student(103, "Bảo", Grades.Grade.F),
				new Student(107, "Vũ", Grades.Grade.C),
				new Student(104, "Hoàng", Grades.Grade.B),
		};
		
		// Kết quả đúng nhưng tổng quát chưa được
		// Nếu đề hỏi danh sách sinh viên được điểm B mà e làm cách này lỡ
		// có 1 bạn học được B xong học cải thiện lại thêm 1 lần thì kết quả bạn đó sẽ bị trùng
		System.out.println("\nDanh sách sinh viên được điểm A: ");
		for (Student student : students) {
			if (student.getGrade() == Grade.A) {
				System.out.println("Mã sinh viên: " + student.getId() + ", Tên: " + student.getName());
			}
		}
		
		// Sai đề, em đọc lại kỹ đề hi
		// Vì có trường hợp bạn đó được điểm F nhưng chưa/không tham gia học lại
		System.out.println("\nDanh sách sinh viên được điểm F và phải đăng ký học lại: ");
		for (Student student : students) {
			if (student.getGrade() == Grade.F) {
				System.out.println("Mã sinh viên: " + student.getId() + ", Tên: " + student.getName());
			}
		}
	}

}
