package view;

import java.util.Arrays;

import bean.Student;

public class Ex01 {

	public static void main(String[] args) {
		
		Student[] students = 
		{
		new Student(102, "Nam", "C"),
		new Student(103, "Bảo", "F"),
		new Student(104, "Hoàng", "D"),
		new Student(105, "Nguyên", "B"),
		new Student(107, "Vũ", "F"),
		new Student(109, "Lan", "A"),
		new Student(202, "Đạt", "C"),
		new Student(103, "Bảo", "F"),
		new Student(107, "Vũ", "C"),
		new Student(104, "Hoàng", "B")
		};
		System.out.println(Arrays.toString(getStudents(students, "A")));
		
	}
	private static Student[] getStudents(Student[] students, String ranking) {
		Student[] res = new Student[students.length];
		int count= 0;
		
 		for (Student student: students) {
			if (student.getRanking().equals(ranking)) {
				res[count++] = student;
			}
			
		}
 		return Arrays.copyOfRange(res, 0, count);
	}
	
}
