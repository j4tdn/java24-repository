package view;

import java.util.Arrays;

import bean.Student;
import bean.StudentCounter;
import common.Rank;
import model.DataModel;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Student[] students = DataModel.mockStudents();
		
		Student[] output = getStudents(students, Rank.F);
		
		generate("1. Danh sach sinh vien dat loai A", output);
		generate("2. Danh sach sinh vien tham gia hoc lai", getStudents(students));
		
		
		
	}
	
	//tim ds sinh vien tham gia hoc lai (xuat hien nhieu hon 1 lan)
			// --> Tim sv xuat hien nhieu hon 1 lan trong danh sach
	
	private static Student[] getStudents(Student[] students) {
		StudentCounter[] counters = counting(students);
		
		Student[] result = new Student[counters.length];
		int count = 0;
		
		for (StudentCounter sc: counters) {
			if (sc.getAmount() > 1) {
				result[count++] = sc.getStudent();
				
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	
	}
	private static StudentCounter[] counting(Student[] students) {
		StudentCounter[] counters = new StudentCounter[students.length];
		int count = 0;
		for (Student student: students) {
			StudentCounter sc = find(counters, student, count);
			if (sc == null) {
				counters[count++] = StudentCounter.of(student, 1);
			}else {
				 sc.plus();
			}
			
		}
		return Arrays.copyOfRange(counters, 0, count);
	}
	
	private static void generate(String prefix, Student[] students) {
		System.out.println(prefix + " {");
		for(Student student: students) {
			System.out.println("  - "+ student);
			
		}
		System.out.println("}\n");
	}
	
	//vs enum, co the dung ==, tuong duong vs equals
	
	//Tim ds sv tung dat loai A trong 2024
	private static Student[] getStudents(Student[] students, Rank rank) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student student: students) {
			if (student.getRank() == rank && !isExist(result, student, count)) {
				result[count++] = student;
				
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	private static boolean isExist(Student[] students, Student student, int count) {
		for (int i = 0; i < count; i++) {
			//can sua
			if (students[i].equals(student)) {
				return true;
			}
		}
		return false;
	}
	private static StudentCounter find(StudentCounter[] counters, Student student, int count) {
		for (int i = 0; i < count; i++) {
			StudentCounter sc = counters[i];
			if (sc.getStudent().equals(student)) {
				return sc;
			}
		}
		return null;
	}

}
