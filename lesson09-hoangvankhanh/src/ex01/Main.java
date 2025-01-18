package ex01;

public class Main {

	public static void main(String[] args) {

		Student[] students = { new Student(102, "Nam", Point.C), new Student(103, "Bảo", Point.F),
				new Student(104, "Hoàng", Point.D), new Student(105, "Nguyên", Point.B),
				new Student(107, "Vũ", Point.F), new Student(109, "Lan", Point.A), new Student(202, "Đạt", Point.C),
				new Student(103, "Bảo", Point.F), new Student(107, "Vũ", Point.C),
				new Student(104, "Hoàng", Point.B), };

		System.out.println("Danh sách sinh viên từng đạt loại A trong năm 2024: ");

		// Lần sau nên viết hàm để xử lý em hi
		for (Student student : students) {
			if (student.getPoint() == Point.A) {
				System.out.println("Mã sinh viên: " + student.getId() + ", Tên: " + student.getName());
			}
		}

//		System.out.println("Danh sách sinh viên đã tham gia học lại(nhiều hơn 1 lần) môn cấu trúc dữ liệu  trong năm 2024:");
//		
//		for (Student student: students) {
//			if(student.getPoint() == Point.F) {
//				System.out.println("Mã sinh viên: " + student.getId() + ", Tên: " + student.getName());
//			}
//		}

		// Cách làm này đúng hơn so với cách em tìm học sinh xếp loại F, nhưng cách làm chưa hay lắm
		// Em phải tốn đến 2 vòng for lồng nhau để xử lý
		// Bài nay a đã từng share 1 lần khi làm bài tìm phần tử trung nhau trong mảng {1,2,1,3,4,5,2}
		System.out.println("Danh sách sinh viên học lại:");
		for (int i = 0; i < students.length; i++) {
			for (int j = i + 1; j < students.length; j++) {
				if (students[i].getId() == students[j].getId()) {
					System.out.println(students[i]);
					break;
				}
			}
		}
	}
}
