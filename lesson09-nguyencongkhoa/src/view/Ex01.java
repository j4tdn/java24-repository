package view;

import bean.Student;

public class Ex01 {

	public static void main(String[] args) {
		Student[] students = { 
				new Student(102, "Nam", "C"), 
				new Student(103, "Bảo", "F"),
				new Student(104, "Hoàng", "A"), 
				new Student(105, "Nguyên", "B"), 
				new Student(105, "Nguyên", "A"),
				new Student(107, "Vũ", "F"), 
				new Student(109, "Lan", "A"), 
				new Student(109, "Lan", "A"),
				new Student(202, "Đạt", "C"),
				new Student(103, "Bảo", "F"), 
				new Student(107, "Vũ", "C"), 
				new Student(104, "Hoàng", "A") };

		getStudentPointA(students);

		getStudentPointFGreaterThan1(students);
	}

	// Ý tưởng của em là tốt rồi, nhưng khi a sửa dữ liệu của bạn 104-Hoàng thì kết quả chưa đúng
	// Vấn đề ở chỗ biết isExist
	// E phải tạo 1 mảng lưu danh sách sinh viên đạt loại A, nếu gặp 1 bạn khác A kiểm tra
	// xem đã nằm trong mảng chưa mới được
	// --> A sẽ sửa tại lớp hi
	private static void getStudentPointA(Student[] students) {
		System.out.println("Danh sách sinh viên từng đạt loại A trong năm 2024: ");
		boolean isExist = false;
		for (Student std : students) {
			if (std.getLearningForce().equals("A")) {
				if (!isExist) {
					System.out.println(std);
				}
			}
			if (isDuplicatedPointOfStudent(students, std.getId(), "A")) {
				isExist = true;
			}
		}
	}

	// Tương tự câu trên, với lại không cần kiểm tra học lực F
	// Có trường hợp F nhưng chưa/không học lại, em xem lại kỹ đề hi
	private static void getStudentPointFGreaterThan1(Student[] students) {
		System.out.print("\nDanh sách sinh viên đã tham gia học lại môn CTDL trong năm 2024:\n");
		boolean isExist = false;
		for (Student std : students) {
			if (std.getLearningForce().equals("F")) {
				if (!isExist) {
					System.out.println(std);
				}
			}

			if (isDuplicatedPointOfStudent(students, std.getId(), "F")) {
				isExist = true;
			}
		}
	}

	private static boolean isDuplicatedPointOfStudent(Student[] students, int id, String point) {
		int cnt = 0;
		for (Student std : students) {
			if (std.getId() == id) {
				if (point.equals(std.getLearningForce())) {
					cnt++;
				}
				if (cnt > 1) {
					return true;
				}
			}
		}
		return false;
	}

}
