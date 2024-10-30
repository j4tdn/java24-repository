package ex01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student sv1 =  new Student(23, "Lê Thị Hương Giang", 9, 9);
		Student sv2 = new Student(24, "Hoàng Văn Khánh", 9, 9);
		System.out.println(sv1);
		System.out.println(sv2);
		
		Student sv3 = new Student();
		inputStudent3(sv3);
		System.out.println(sv3);
		
		Student[] students = {sv1,sv2,sv3};
		studentsWithHighAverage(students);
		winOrLose(students);
		
		
	}
	public static void winOrLose(Student[] students) {
		System.out.println("Sinh Viên có điểm Lý Thuyết lớn hơn điểm thực hành");
		for(Student student : students) {
			if(student.getTheoryScore() > student.getPracticeScore()){
				System.out.println(student);
			}
		}
	}
	
	public static void studentsWithHighAverage(Student[] students) {
	    System.out.println("Sinh Viên có điểm trung bình > 8.5:");
	    for (Student student : students) {  
	        if (student.calcAverageScore() > 8.5) {
	            System.out.println(student);
	        }
	    }
	}

	
	public static void inputStudent3(Student student) {
		Scanner ip =  new Scanner(System.in);
		System.out.print("studentID: ");
	    student.setStudentID(ip.nextInt());

	    System.out.print("name: " + ip.nextLine());
	    student.setName(ip.nextLine());

	    System.out.print("theoryscore: ");
	    student.setTheoryScore(ip.nextDouble());

	    System.out.print("practicescore: ");
	    student.setPracticeScore(ip.nextDouble());

	    ip.close();
		
		
	}
}

