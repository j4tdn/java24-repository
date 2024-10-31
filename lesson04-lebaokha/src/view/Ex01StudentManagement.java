package view;

import bean.Student;
import utils.FindPointStudent;
import utils.IoStudent;

public class Ex01StudentManagement {

	public static void main(String[] args) {

		Student st1 = new Student("sv1", "Lê Bảo Kha", 9.3f, 8.5f);
		Student st2 = new Student("sv2", "Lê Văn Tèo", 5.7f, 5.6f);

		Student st3 = new Student();
		IoStudent.enterInformation(st3);

		Student[] students = { st1, st2, st3 };

		for (Student student : students) {
			System.out.println(student);
		}
		
		System.out.println("=========================");
		FindPointStudent.findAvgPoint(students, 8.5f);
		System.out.println();
		FindPointStudent.findPoint(students);
		

	}

}
