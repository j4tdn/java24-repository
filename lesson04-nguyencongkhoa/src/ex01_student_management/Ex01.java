package ex01_student_management;

import java.util.Scanner;

import bean.Student;

public class Ex01 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Student[] students = baseDataStudent();
		
		System.out.println("\nStudent information with an average score greater than 8.5: ");
		findAvgGreaterThan8_5(students);
		
		System.out.println("\nStudent information with theory score greater than practice score: ");
		findTheoryGreaterThanTheory(students);
	}
	
	private static Student[] baseDataStudent() {
		Student sv1 = new Student(1, "Khoa", 8, 9);
		Student sv2 = new Student(2, "Huy", 10, 9);
		Student sv3 = new Student();
		System.out.print("Enter Student ID: ");
		sv3.setId(sc.nextInt());
		sc.nextLine();
		System.out.print("Enter Student Name: ");
		sv3.setName(sc.nextLine());
		System.out.print("Enter Student Theory Scores: ");
		sv3.setTheoryPoint(sc.nextDouble());
		System.out.print("Enter Student Practice Scores: ");
		sv3.setPracticePoint(sc.nextDouble());
		return new Student[] {sv1,sv2,sv3};
	}
	
	private static void findAvgGreaterThan8_5(Student[] students) {
		for (Student s : students) {
			if (s.avgPoint() > 8.5) {
				System.out.println(s);
			}
		}
	}
	
	private static void findTheoryGreaterThanTheory(Student[] students) {
		for (Student s : students) {
			if (s.getTheoryPoint() > s.getPracticePoint()) {
				System.out.println(s);
			}
		}
	}
	
}
