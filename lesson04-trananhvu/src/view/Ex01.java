package view;

import bean.Student;
import utils.StudentUtils;

public class Ex01 {

	public static void main(String[] args) {
		Student sv1 = new Student(27, "Tran Anh Vu", 9.5f, 9.7f);
		Student sv2 = new Student(2, "Tunizme", 6.2f, 5.8f);
		Student sv3 = new Student();
		sv3.setId(23);
		sv3.setName("Vu Tran");
		sv3.setPracScore(8.8f);
		sv3.setTheoScore(8.3f);

		Student[] sv = new Student[] { sv1, sv2, sv3 };
		StudentUtils.getGoodStudents(sv);
		System.out.println("----------------------------------------------------------------------------------------");
		StudentUtils.getSpecialStudents(sv);
	}
}
