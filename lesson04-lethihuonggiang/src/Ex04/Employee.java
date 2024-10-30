package Ex04;

import java.util.Date;

public abstract class Employee {
	private String name;
	private Date birthDay;
	private double salaryCoefficient;
	private double positionCoefficient;
	
	public abstract double calcSalary();
	
	public Employee(String name, Date birthDay, double salaryCoefficient, double positionCoefficient) {
		this.name = name;
		this.birthDay = birthDay;
		this.salaryCoefficient = salaryCoefficient;
		this.positionCoefficient = positionCoefficient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public double getSalaryCoefficient() {
		return salaryCoefficient;
	}

	public void setSalaryCoefficient(double salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}

	public double getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(double positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", birthDay=" + birthDay + ", salaryCoefficient=" + salaryCoefficient
				+ ", positionCoefficient=" + positionCoefficient + "]";
	}
	
	
	

}
