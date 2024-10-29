package bean;

import java.util.Scanner;

public class Student {

	private Integer studentId;
	private String name;
	private Double theoreticalScore;
	private Double practiceScore;
	private Double avgScore;
	
	Scanner ip = new Scanner(System.in);

	public Student() {

	}

	public Student(Integer studentId, String name, Double theoreticalScore, Double practiceScore) {
		this.studentId = studentId;
		this.name = name;
		this.theoreticalScore = theoreticalScore;
		this.practiceScore = practiceScore;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getTheoreticalScore() {
		return theoreticalScore;
	}

	public void setTheoreticalScore(Double theoreticalScore) {
		this.theoreticalScore = theoreticalScore;
	}

	public Double getPracticeScore() {
		return practiceScore;
	}

	public void setPracticeScore(Double practiceScore) {
		this.practiceScore = practiceScore;
	}
	
	public Double getAvgScore() {
		return (theoreticalScore + practiceScore) / 2;
	}
	
	//Hàm nhập thông tin new object
	
	public void setNewStudent() {
		System.out.println("Nhập mã sinh viên");
		this.studentId = Integer.parseInt(ip.nextLine());
		
		System.out.println("Nhập tên sinh viên");
		this.name = ip.nextLine();
		
		System.out.println("Nhập điểm lý thuyết");
		this.theoreticalScore = Double.parseDouble(ip.nextLine());
		
		System.out.println("Nhập điểm thực hành");
		this.practiceScore = Double.parseDouble(ip.nextLine());
		
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", theoreticalScore=" + theoreticalScore
				+ ", practiceScore=" + practiceScore + ", avgScore=" + avgScore + ", getAvgScore()=" + getAvgScore()
				+ "]";
	}

	

}
