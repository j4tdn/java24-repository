package view;

import java.util.Iterator;

import bean.Student;

public class Ex01 {
	
	public static void main(String[] args) {
		Student[] list = {};
		Student[] students = {
				new Student(102, "Nam", "C"),
				new Student(103, "Bảo", "F"),
				new Student(104, "Hoàng", "D"),
				new Student(105, "Nguyên", "B"),
				new Student(107, "Vũ", "F"),
				new Student(109, "Lan", "A"),
				new Student(202, "Đạt", "C"),
				new Student(103, "Bảo", "F"),
				new Student(107, "Vũ", "C"),
				new Student(104, "Hoàng", "B")	
		};
		
		
		System.out.println("DS Sinh vien dat loai A: ");
		for (Student student : students) {
			if (student.getRank() == "A") {
				System.out.println(student);
			}
		}
		
		System.out.println("DS Sinh vien hoc lai 2 lan: ");
		for(int i = 0; i < students.length; i ++) {
			for(int j = i + 1; j <students.length; i++) {
				Integer sv = students[i].getMSV();
				if(students[j].getMSV() == sv) {
					System.out.println(students[i]);
				}
			}
		}
	}

}
