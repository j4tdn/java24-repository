package live.demo;

import java.time.LocalDate;

public  class Information {
	private String  fullName;
	private LocalDate birthOfDate;
	private Double salary;
	private Double positionCoefficient;
	
	public Information() {
		// TODO Auto-generated constructor stub
	}

	public Information(String fullName, LocalDate birthOfDate, Double salary, Double positionCoefficient) {
		
		this.fullName = fullName;
		this.birthOfDate = birthOfDate;
		this.salary = salary;
		this.positionCoefficient = positionCoefficient;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(LocalDate birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Double getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(Double positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}
	
	
	
}
