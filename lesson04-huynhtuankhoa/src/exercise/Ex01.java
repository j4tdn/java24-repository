package exercise;

import java.util.Scanner;

import bean.Student;

public class Ex01 {
	private static Scanner sc = new Scanner(System.in);
	private static Student[] studentList;
	
	
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Khoa", 10f, 9f);
		Student sv2 = new Student(2, "Nam", 7.5f, 6.5f);
		Student sv3 = new Student();
		
		createStudent(sv3);
		
		studentList = new Student[]{sv1,sv2,sv3};
		
		findStudentHasMeanLarge();
		
		findStudentHasTheoPointLargerPracPoint();
		
	}
	
	public static void createStudent(Student sv) {
		System.out.println("Enter id: ");
		sv.setId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter name: ");
		sv.setName(sc.nextLine());
		System.out.println("Enter theory point: ");
		sv.setTheoryPoint(Float.parseFloat(sc.nextLine()));
		System.out.println("Enter practical point: ");
		sv.setPracticePoint(Float.parseFloat(sc.nextLine()));
	}
	
	public static void findStudentHasMeanLarge() {
		System.out.println("Students have mean point larger than 8.5:");
		for (Student student: studentList) {
			if (student.calMeanPoint() > 8.5) {
				System.out.println(student.toString());
			}
					
		}
	}
	
	public static void findStudentHasTheoPointLargerPracPoint() {
		System.out.println("Students have theory point larger than practical point:");
		for (Student student: studentList) {
			if (student.getTheoryPoint() > student.getPracticePoint()) {
				System.out.println(student.toString());
			}
		}
	}
	
}
