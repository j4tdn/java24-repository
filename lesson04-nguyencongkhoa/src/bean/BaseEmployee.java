package bean;

import java.time.LocalDate;

public abstract class BaseEmployee {
	
	protected String name;
	protected LocalDate birthday;
	protected double salaryCoefficient;
	
	public BaseEmployee() {
	}

	public BaseEmployee(String name, LocalDate birthday, double salaryCoefficient) {
		this.name = name;
		this.birthday = birthday;
		this.salaryCoefficient = salaryCoefficient;
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

	public double getSalaryCoefficient() {
		return salaryCoefficient;
	}

	public void setSalaryCoefficient(double salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}

	public abstract long salary(); 
	
	@Override
	public String toString() {
		return "[name=" + name + ", birthday=" + birthday + ", salaryCoefficient=" + salaryCoefficient + " ";
	}
	
}
