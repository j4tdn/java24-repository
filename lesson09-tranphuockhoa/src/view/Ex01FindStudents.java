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
	
	public static List<String> findStudentsScoreA(Student[] students) {
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
	
	