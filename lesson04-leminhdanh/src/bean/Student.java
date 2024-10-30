package bean;

import java.util.Scanner;

public class Student {
	private Integer idStudent;
	private String nameStudent;
	private Double theoryScore;
	private Double practiceScore;

	public Student() {
	}

	public Student(Integer idStudent, String nameStudent, Double theoryScore, Double practiceScore) {
		this.idStudent = idStudent;
		this.nameStudent = nameStudent;
		this.theoryScore = theoryScore;
		this.practiceScore = practiceScore;
	}

	public Integer getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(Integer idStudent) {
		this.idStudent = idStudent;
	}

	public String getNameStudent() {
		return nameStudent;
	}

	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}

	public double getTheoryScore() {
		return theoryScore;
	}

	public void setTheoryScore(Double theoryScore) {
		this.theoryScore = theoryScore;
	}

	public double getPracticeScore() {
		return practiceScore;
	}

	public void setPracticeScore(Double practiceScore) {
		this.practiceScore = practiceScore;
	}

	public void Input() {
		Scanner ip = new Scanner(System.in);

		System.out.print("nhap ma so sinh vien: ");
		Integer id = Integer.parseInt(ip.nextLine());
		setIdStudent(id);
		System.out.print("\nnhap ten sinh vien: ");
		String name = ip.nextLine();
		setNameStudent(name);
		System.out.print("\nnhap diem ly thuyet: ");
		Double theory = Double.parseDouble(ip.nextLine());
		setTheoryScore(theory);
		System.out.print("\nnhap diem thuc hanh: ");
		Double practice = Double.parseDouble(ip.nextLine());
		setPracticeScore(practice);
	}

	public double averageScore() {
		return (theoryScore + practiceScore) / 2;
	}

	@Override
	public String toString() {
		return "StudentManagement [idStudent=" + idStudent + ", nameStudent=" + nameStudent + ", theoryScore="
				+ theoryScore + ", practiceScore=" + practiceScore + "]";
	}

}
