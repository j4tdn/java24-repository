package view;

import java.util.Iterator;

import bean.Student;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Student[] students = 
		{ 
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
		
		// Lần sau em nên tách hàm để xử lý cho từng câu hi
		
		// Kết quả tạm đúng
		// Nhưng nếu a chuyển qua tìm học sinh đặt loại C, sẽ có thể xảy ra trường hợp
		// là một bạn học loại C 2 lần, khi đó kết quả tên bạn đó sẽ bị trùng, chưa được
		System.out.println("Học sinh đạt hạng A: ");
		for(Student student:students) {
			if(student.getRank() == 'A') {
				System.out.println(student);
			}
		} 
		
		System.out.println("Các học sinh học lại: ");

		
		// Chưa đúng yêu cầu
		// Em xem kỹ lại đề hi
		// Tìm danh sách sinh viên đã tham gia học lại(học nhiều hơn 1 lần)môn cấu trúc dữ liệu trong
		// năm 2024.
		for(Student student:students) {
			if(student.getRank() == 'F') {
				System.out.println(student);
			}
		}
		
		System.out.println("Các học sinh học lại 2 lần: ");
		
		

}
	
//	private static String getStudent(Student[] students) {
//		System.out.println("Các học sinh học lại: ");
//		for(Student student:students) {
//			if(student.getRank() == 'F') {
//				System.out.println(student);
//			}
//		}
//		
//		return 
//	}
	
}