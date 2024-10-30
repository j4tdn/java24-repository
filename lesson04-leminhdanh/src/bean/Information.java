package bean;

import java.time.LocalDate;

public class Information {
	private String name;
	private LocalDate bith;
	private Double salary;
	private Double titleLevel;
	private String department;

	public Information() {
	}

	public Information(String name, LocalDate bith, Double salary, Double titleLevel, String department) {
		this.name = name;
		this.bith = bith;
		this.salary = salary;
		this.titleLevel = titleLevel;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBith() {
		return bith;
	}

	public void setBith(LocalDate bith) {
		this.bith = bith;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Double getTitleLevel() {
		return titleLevel;
	}

	public void setTitleLevel(Double titleLevel) {
		this.titleLevel = titleLevel;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Information [name=" + name + ", bith=" + bith + ", salary=" + salary + ", titleLevel=" + titleLevel
				+ ", department=" + department + "]";
	}
	
	
}
