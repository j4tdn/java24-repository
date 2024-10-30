package bean;

import java.time.LocalDate;

public class Human {

	private String name;
	private LocalDate birth;
	private Double salaryRanking;
	private Double levelRanking;
	private String department;
	private String level;

	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, LocalDate birth, Double salaryRanking, Double levelRanking, String department) {
		this.name = name;
		this.birth = birth;
		this.salaryRanking = salaryRanking;
		this.levelRanking = levelRanking;
		this.department = department;
		this.level = "Trưởng Phòng";
	}

	public Human(String name, LocalDate birth, Double salaryRanking, Double levelRanking) {
		this.name = name;
		this.birth = birth;
		this.salaryRanking = salaryRanking;
		this.levelRanking = levelRanking;
		this.department = "None";
		this.level = "Giám đốc";
	}

	public Human(String name, LocalDate birth, Double salaryRanking, String department) {
		this.name = name;
		this.birth = birth;
		this.salaryRanking = salaryRanking;
		this.department = department;
		this.levelRanking = 0d;
		this.level = "Nhân viên";
	}

	public String getLevel() {
		return level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	public Double getSalaryRanking() {
		return salaryRanking;
	}

	public void setSalaryRanking(Double salaryRanking) {
		this.salaryRanking = salaryRanking;
	}

	public Double getLevelRanking() {
		return levelRanking;
	}

	public void setLevelRanking(Double levelRanking) {
		this.levelRanking = levelRanking;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double salaryCalc(Human h) {
		double salary = 0;
		return salary;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", birth=" + birth + ", salaryRanking=" + salaryRanking + ", levelRanking="
				+ levelRanking + ", department=" + department + "]";
	}

}
