package view;

import java.util.Arrays;

import bean.Student;

public class Ex01StudentManage {
	public static void main(String[] args) {
		Student[] students = {
				new Student(102, "Nam", 'C'),
				new Student(103, "Bảo", 'F'),
				new Student(104, "Hoàng", 'D'),
				new Student(105, "Nguyên", 'B'),
				new Student(107, "Vũ", 'F'),
				new Student(109, "Lan", 'A'),
				new Student(202, "Đạt", 'C'),
				new Student(103, "Bảo", 'F'),
				new Student(107, "Vũ", 'C'),
				new Student(104, "Hoàng", 'B')
				};
		System.out.println("Học sinh đạt loại A - > " + Arrays.toString(getStudentWithA(students)));
		System.out.println("Nhung hoc sinh hoc lai --> " + Arrays.toString(reStudyStudent(students)));
	}
	
	// Kết quả đúng nhưng tổng quát chưa được
	// Nếu đề hỏi danh sách sinh viên được điểm B mà e làm cách này lỡ
	// có 1 bạn học được B xong học cải thiện lại thêm 1 lần thì kết quả bạn đó sẽ bị trùng
	// Điểm tốt: cách code sạch sẽ, tốt
	public static Student[] getStudentWithA(Student[] students) {
		Student[] res = new Student[students.length];
		int count = 0;
		for(Student student : students) {
			if(student.getRank().equals('A')) {
				res[count++] = student;
			}
		}
		return Arrays.copyOfRange(res, 0, count);
	}
	
	
	// Sai đề, em đọc lại kỹ đề hi
	// Vì có trường hợp bạn đó được điểm F nhưng chưa/không tham gia học lại
	public static Student[] reStudyStudent(Student[] students) {
		Student[] res = new Student[students.length];
		int count = 0;
		for(Student student : students) {
			if(student.getRank().equals('F')) {
				res[count++] = student;
			}
		}
		return Arrays.copyOfRange(res, 0, count);
	}
	
	
}
