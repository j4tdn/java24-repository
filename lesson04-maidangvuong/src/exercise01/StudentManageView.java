package exercise01;

import java.util.Scanner;

public class StudentManageView {

	public static void main(String[] args) {
		
		StudentManage student1 = new StudentManage(1, "Mai Đăng Vương", 10d, 9d);
		
		StudentManage student2 = new StudentManage(2, "Lê Quốc Cường", 9d, 9d);
		
		StudentManage student3 = new StudentManage();
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter the id of student: ");
		student3.setId(Integer.parseInt(ip.nextLine()));
		
		System.out.println("Enter student name: ");
		student3.setName(ip.nextLine());
		
		System.out.println("Enter theory score: ");
		student3.setTheoryScore(ip.nextDouble());
		
		System.out.println("Enter practice score: ");
		student3.setPracticeScore(ip.nextDouble());
		
		ip.close();
		
		System.out.printf("%-10s %-16s %-15s %-15s %-15s%n", "ID", "Name", "Theory Score", "Practice Score", "Average Score");
		System.out.printf("%-5d %-25s %-16.2f %-15.2f %-20.2f%n", student1.getId(), student1.getName(), student1.getTheoryScore(), student1.getPracticeScore(), student1.calcAverageScore());
		System.out.printf("%-5d %-25s %-16.2f %-15.2f %-20.2f%n", student2.getId(), student2.getName(), student2.getTheoryScore(), student2.getPracticeScore(), student2.calcAverageScore());
		System.out.printf("%-5d %-25s %-16.2f %-15.2f %-20.2f%n", student3.getId(), student3.getName(), student3.getTheoryScore(), student3.getPracticeScore(), student3.calcAverageScore());
		
		StudentManage[] students = new StudentManage[] {student1, student2, student3};
		
		for (StudentManage student : students) {
			if(student.calcAverageScore() > 8.5d) {
				System.out.println("Student have average score better than 8.5 is: " + student.getName() + " ID: " + student.getId());
			} 
		}
		
		for (StudentManage student : students) {
			if(student.getTheoryScore() > student.getPracticeScore()) {
				System.out.println("Student have theory score better than practice score is: " + student.getName() + " ID: " + student.getId());
			} 
		}
	}
	
}
