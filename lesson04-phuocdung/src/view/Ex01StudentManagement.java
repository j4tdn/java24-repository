package view;

import java.util.Scanner;

import bean.Student;
import utils.StudentUtils;

public class Ex01StudentManagement {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		Student sv1 = new Student(01, "Dũng", 9.0d, 8.5d);
		Student sv2 = new Student(02, "Hùng", 9.0d, 10.0d);
		Student sv3 = new Student();

		sv3.setNewStudent();

		Student[] students = { sv1, sv2, sv3 };

		StudentUtils.findAvgScore(students, 8.5);

		StudentUtils.findPracticeScore(students);

		ip.close();
	}

}
