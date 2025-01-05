package view;

import java.util.Arrays;

import bean.Student;

public class Ex01GetStudents {

	public static void main(String[] args) {
		
		Student[] students = {
				new Student(102, "Nam", "C"),
				new Student(103, "Bảo", "F"),
				new Student(104, "Hoàng","D"),
				new Student(105, "Nguyên", "B"),
				new Student(107, "Vũ", "F"),
				new Student(109, "Lan", "A"),
				new Student(202, "Đạt", "C"),
				new Student(103, "Bảo", "F"),
				new Student(107, "Vũ", "C"),
				new Student(104, "Hoàng", "B")
				};
		
		Student[] studentsRankA = getStudentsRankA(students);
		System.out.println("Danh sách sinh viên từng đạt hạng A trong năm 2024");
		for (Student student : studentsRankA) {
			System.out.println(student);
		}
		
		Student[] studentsRankF = getStudentsRankF(students);
		System.out.println("Danh sách sinh viên đã tham gia học lại (nhiều hơn 1 lần)");
		for (Student student : studentsRankF) {
			System.out.println(student);
		}
				
	}
	
	private static Student[] getStudentsRankA(Student[] students) {
		Student[] studentsRankA = new Student[10];
		int i = 0;
		
		for (Student student : students) {
			
			if(student.getRank() == "A") {
				studentsRankA[i] = student;
				i++;
			}
		}
		
		return Arrays.copyOfRange(studentsRankA, 0, i);
	}
	
	private static Student[] getStudentsRankF(Student[] students) {
		Student[] studentsRankF = new Student[10];
		int i = 0;
		
		for (Student student : students) {
			
			if(student.getRank() == "F") {
				studentsRankF[i] = student;
				i++;
			}
		}
		
		studentsRankF = Arrays.copyOfRange(studentsRankF, 0, i);
		
		Student[] targetStudents = new Student[10];
		int n = 0;
		
		for(int x = 0; x < studentsRankF.length; x++) {
			for(int y = 0; y < studentsRankF.length; y++) {
				if(studentsRankF[x].equals(studentsRankF[y]) && x != y) {
					targetStudents[n] = studentsRankF[x];
					n++;
				}
			}
		}
		
		return Arrays.copyOfRange(targetStudents, 0, n);
	}


}
