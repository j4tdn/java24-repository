package view;

import java.util.Arrays;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.Student;
import bean.StudentCounter;
import common.Rank;
import model.DataModel;

public class Ex01 {
	
	public static void main(String[] args) {
		Student[] students = DataModel.mockStudents();
		
		generate(
			"1. Danh sách sinh viên từng đạt loại C trong năm 2024", 
			getStudents(students, Rank.C)
		);
		
		
		generateCustom(
			"2. Danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2024", 
			getStudents(students)
		);
	}
	
	// Tìm danh sách sinh viên đã tham gia học lại(học nhiều hơn 1 lần)
	// môn cấu trúc dữ liệu trong năm 2024
	// --> Tìm sinh viên xuất hiện nhiều hơn 1 lần trong danh sách
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
	
	// null, null, null, null, null, null, null, null, null, null
	// {s102, 1}, {s103, 4}, {s104, 1}, {s105, 1}, {s107, 1}
	// {s109, 1}, {s202, 1}
	private static StudentCounter[] counting(Student[] students) {
		StudentCounter[] counters = new StudentCounter[students.length];
		int count = 0;
		for (Student student: students) {
			StudentCounter sc = find(counters, student, count);
			if (sc == null) {
				counters[count++] = StudentCounter.of(student, 1);
			} else {
				sc.plus();
			}
		}
		return Arrays.copyOfRange(counters, 0, count);
	}
	
	private static void generateCustom(String prefix, Student[] students) {
		System.out.println(prefix + " {");
		for (Student student: students) {
			System.out.println("   - " + student.getId() + ", " + student.getName());
		}
		System.out.println("}\n");
	}
	
	
	private static void generate(String prefix, Student[] students) {
		System.out.println(prefix + " {");
		for (Student student: students) {
			System.out.println("   - " + student);
		}
		System.out.println("}\n");
	}
	
	// Với enum, có thể dùng ==, tương đương với equals
	// Tìm danh sách sinh viên từng đạt loại A trong năm 2024.
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
			if (students[i].equals(student)) {
				return true;
			}
		}
		return false;
	}
	
	// {s102, 1}, {s103, 3}, {s104, 1}, {s105, 1}, {s107, 1}
	// {s109, 1}, {s202, 1}
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
