package model;

import bean.Student;

import static common.Rank.*;

public class DataModel {
	
	private DataModel() {
	}
	
	public static Student[] mockStudents() {
		return new Student[] {
			new Student(102, "Nam", C),
			new Student(103, "Bảo", F),
			new Student(104, "Hoàng", D),
			new Student(105, "Nguyên", B),
			new Student(107, "Vũ", F),
			new Student(109, "Lan", A),
			new Student(202, "Đạt", C),
			new Student(103, "Bảo", F),
			new Student(107, "Vũ", C),
			new Student(104, "Hoàng", B),
			new Student(104, "Hoàng", A)
		};
	}
	
}
