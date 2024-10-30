package ex01;

import java.util.Scanner;

import bean.Student;

public class StudentsManagement {
	
	
	
	public static void main(String[] args) {
		Student sv1 = new Student(4715,"Tran Phuoc Khoa", 9.2d, 8.1d);
		Student sv2 = new Student(2581,"Vo Anh Tuan", 8.1d, 7.5d);
		Student sv3 = new Student();
		
		
		addInformation(sv3);
		
		Student[] students = {sv1, sv2, sv3};
		
		// in ra de kiem tra xem co sai sot khong
		
		
		
		System.out.println("sv1 " + sv1);
		System.out.println("sv2 " + sv2);
		System.out.println("sv3 " + sv3);

		avgPointHigherThan85(students);
		
		theoryHigherThanPractise(students);
		
	}
	
	private static void addInformation(Student student) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student ID: ");
	        student.setStudentID(Integer.parseInt(sc.nextLine()));
	       
	    System.out.println("Enter student name: ");  
	    	student.setStudentName(sc.nextLine());
	    
	    System.out.println("Enter theory point: ");
	    	student.setTheoryPoint(Double.parseDouble(sc.nextLine()));
	    	
	    System.out.println("Enter practice point: ");
	    	student.setPracticePoint(Double.parseDouble(sc.nextLine()));
	    sc.close();
	}
	
	private static void avgPointHigherThan85(Student[] students) {

		for (Student student : students) {
			if (student.calAveragePoint()> 8.5) {
				System.out.println("Sinh viên có điểm tb trên 8.5: " + student.getStudentName());
			}
		}

	}
	
	private static void theoryHigherThanPractise(Student[] students) {
		for (Student student : students) {
			if (student.getTheoryPoint()> student.getPracticePoint()) {
				System.out.println("Sinh viên có điểm lí thuyết cao hơn thực hành là: " + student.getStudentName());
			}
		}
	}
}
