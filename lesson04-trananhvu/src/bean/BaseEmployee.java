package bean;

import java.time.LocalDate;

public abstract class BaseEmployee {
	private String name;
	private LocalDate birthday;
	private double salaryLevel;
	private double regencyLevel;

	public abstract double totalSalary();

	public BaseEmployee() {
	}

	public BaseEmployee(String name, LocalDate birthday, double salaryLevel, double regencyLevel) {
		this.name = name;
		this.birthday = birthday;
		this.salaryLevel = salaryLevel;
		this.regencyLevel = regencyLevel;
	}

	public BaseEmployee(String name, LocalDate birthday, double salaryLevel) {
		this.name = name;
		this.birthday = birthday;
		this.salaryLevel = salaryLevel;
		this.regencyLevel = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public double getSalaryLevel() {
		return salaryLevel;
	}

	public void setSalaryLevel(double salaryLevel) {
		this.salaryLevel = salaryLevel;
	}

	public double getRegencyLevel() {
		return regencyLevel;
	}

	public void setRegencyLevel(double regencyLevel) {
		this.regencyLevel = regencyLevel;
	}

	public abstract double getTotalSalary();

	@Override
	public String toString() {
		return "BaseEmployee [name=" + name + ", birthday=" + birthday + ", salaryLevel=" + salaryLevel
				+ ", regencyLevel=" + regencyLevel + "]";
	}

}
