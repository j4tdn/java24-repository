package view;

import java.util.Arrays;
import java.util.Scanner;

import bean.Student;

public class Ex01Student {
	static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		Student s1 = new Student(106210240, "Nguyen Phuc Huy", 9.5d, 8.8d);
		Student s2 = new Student(106210250, "Tran Anh Vu", 8.0d, 8.5d);
		Student s3 = new Student();
		inputStudent(s3);

		System.out.println("S1 --> " + s1);
		System.out.println("S2 --> " + s2);
		System.out.println("S3 --> " + s3);
		Student[] students = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		System.out.println(
				"Sinh viên có điểm trung bình lớn hơn 8.5:\n " + Arrays.toString(averageScoreFilter(students)));
		System.out.println(
				"Sinh viên với điểm lý thuyết lớn hơn điểm thực hành:\n " + Arrays.toString(scoreFilter(students)));
	}

	private static Student[] averageScoreFilter(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student s : students) {
			if (s.averageScoreCal() > 8.5d) {
				result[count] = s;
				count++;
			}

		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static Student[] scoreFilter(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student s : students) {
			if (s.getTheoryScore() > s.getPracticalScore()) {
				result[count] = s;
				count++;
			}

		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static void inputStudent(Student s1) {
		System.out.print("Nhập mã Sv3: ");
		s1.setStudentId(Integer.parseInt(ip.nextLine()));
		System.out.print("Nhập tên Sv3: ");
		s1.setName(ip.nextLine());
		System.out.print("Nhập điểm lý thuyết Sv3: ");
		s1.setTheoryScore(Double.parseDouble(ip.nextLine()));
		System.out.print("Nhập điểm thực hành Sv3: ");
		s1.setPracticalScore(Double.parseDouble(ip.nextLine()));
	}

}
