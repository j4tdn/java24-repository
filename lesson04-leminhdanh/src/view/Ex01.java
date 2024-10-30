package view;

import bean.Student;
import utils.StudentUtils;

public class Ex01 {
	public static void main(String[] args) {
		Student sv1 = new Student(106210231, "Le Minh Danh", 8.3d, 9.5d);
		Student sv2 = new Student(106210252, "Bui Nhat Tan", 9d, 8.5d);
		Student sv3 = new Student();
		sv3.Input();
		Student[] sv = new Student[] {sv1, sv2, sv3};
		StudentUtils.findGoodStudent(sv);
		System.out.println("\n=================================\n");
		StudentUtils.findStudentsWithTheoryScoreGreaterThanPracticeScore(sv);
		
	}
}
