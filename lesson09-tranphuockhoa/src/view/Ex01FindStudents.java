package view;

import java.util.ArrayList;
import java.util.List;

import bean.Student;

public class Ex01FindStudents {

	public static void main(String[] args) {
		
		
		
		Student[] students = { 
				new Student(102, "Nam", "C"),
				new Student(103, "Bảo", "F"),
				new Student(104, "Hoàng", "D"),
				new Student(105, "Nguyên", "B"),
				new Student(107, "Vũ", "F"),
				new Student(109, "Lan", "A"),
				new Student(202, "Đạt", "C"),
				new Student(103, "Bảo", "F"),
				new Student(107, "Vũ", "C"),
				new Student(104, "Hoàng", "B") };
		
		List<String> studentsWithA = findStudentsScoreA(students);
		
		System.out.println("Sinh viên đạt loại A năm 2024 là: " + studentsWithA);
		
		System.out.println("Sinh viên đã tham gia học lại là: " + findStudentReStudying(students));
		
	}
	
	// Biết dùng các KDL liên quan đến Collection là tốt
	// Nhưng tạm thời chưa cần dùng em nha, vì để a ra a cũng cân nhắc phạm vi sử dụng CTDL rồi
	
	// Khai báo hàm nên là findStudents(Student[] students, Rank rank) thì sẽ tổng quát hơn
	// Kết quả tạm đúng
    // Nhưng nếu a chuyển qua tìm học sinh đặt loại C, sẽ có thể xảy ra trường hợp
    // là một bạn học loại C 2 lần, khi đó kết quả tên bạn đó sẽ bị trùng, chưa được
	public static List<String> findStudentsScoreA(Student[] students) {
		
		// Không chơi đặt tên biết 1 2 như này nghen :(
	    List<String> result1 = new ArrayList<>();
	    
	    for (int i = 0; i < students.length; i++) {
	        Student student = students[i];
	        String score = student.getScore();
	        if (score.equals("A")) {
	            String name = student.getStudentName();
	            result1.add(name);
	        }
	    }
	    return result1;
	}

	
	public static List<String> findStudentReStudying(Student[] students) {
		List<String> result2 = new ArrayList<>();
		List<Integer> seenStudents = new ArrayList<>();
		
		for (int i = 0; i < students.length; i++) {
	        Student student = students[i];
	        int ID = student.getStudentID();
	        String name = student.getStudentName();
	        
	        // Em có thể dùng hàm contains cho đối tượng student luôn cũng được
	        // Mà phải override hàm equals trong class Student
	        // Nên a mới nói khoan dùng các CTDL a chưa hướng dẫn
	        if (seenStudents.contains(ID)) {
	            if (!result2.contains(name)) {
	                result2.add(name);
	            }
	        } else {
	            seenStudents.add(ID);
	        }
        }
		return result2;
	}
}
	
	