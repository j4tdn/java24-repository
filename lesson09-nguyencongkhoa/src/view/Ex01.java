package view;

import bean.Student;

public class Ex01 {

	public static void main(String[] args) {
		Student[] students = { 
				new Student(102, "Nam", "C"), 
				new Student(103, "Bảo", "F"),
				new Student(104, "Hoàng", "D"), 
				new Student(105, "Nguyên", "B"), 
				new Student(105, "Nguyên", "A"),
				new Student(107, "Vũ", "F"), 
				new Student(109, "Lan", "A"), 
				new Student(109, "Lan", "A"),
				new Student(202, "Đạt", "C"),
				new Student(103, "Bảo", "F"), 
				new Student(107, "Vũ", "C"), 
				new Student(104, "Hoàng", "B") };

		getStudentPointA(students);

		getStudentPointFGreaterThan1(students);
	}

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
