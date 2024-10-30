package utils;

import bean.Student;

public class StudentUtils {
	
	public static void findGoodStudent(Student[] students) {
		System.out.println("sinh viên có điểm trung bình lớn hơn 8.5:");
		for (Student student : students) {
			if(student.averageScore()>8.5)
				System.out.println(student.getIdStudent() + "\t" + student.getNameStudent());
		}
	}
	
	public static void findStudentsWithTheoryScoreGreaterThanPracticeScore(Student[] students) {
		System.out.println("sinh viên có điểm lý thuyết lớn hơn điểm thực hành:");
		for (Student student : students) {
			if(student.getTheoryScore()>student.getPracticeScore())
				System.out.println(student.getIdStudent() + "\t" + student.getNameStudent());
		}
	}
}
